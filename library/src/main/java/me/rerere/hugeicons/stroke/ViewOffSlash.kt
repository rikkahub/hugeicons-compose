package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ViewOffSlash: ImageVector
    get() {
        if (_viewOffSlash != null) {
            return _viewOffSlash!!
        }
        _viewOffSlash = ImageVector.Builder(
            name = "ViewOffSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.439f, 15.439f)
        curveTo(20.3636f, 14.5212f, 21.0775f, 13.6091f, 21.544f, 12.955f)
        curveTo(21.848f, 12.5287f, 22f, 12.3155f, 22f, 12f)
        curveTo(22f, 11.6845f, 21.848f, 11.4713f, 21.544f, 11.045f)
        curveTo(20.1779f, 9.12944f, 16.6892f, 5f, 12f, 5f)
        curveTo(11.0922f, 5f, 10.2294f, 5.15476f, 9.41827f, 5.41827f)
        moveTo(6.74742f, 6.74742f)
        curveTo(4.73118f, 8.1072f, 3.24215f, 9.94266f, 2.45604f, 11.045f)
        curveTo(2.15201f, 11.4713f, 2f, 11.6845f, 2f, 12f)
        curveTo(2f, 12.3155f, 2.15201f, 12.5287f, 2.45604f, 12.955f)
        curveTo(3.8221f, 14.8706f, 7.31078f, 19f, 12f, 19f)
        curveTo(13.9908f, 19f, 15.7651f, 18.2557f, 17.2526f, 17.2526f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.85786f, 10f)
        curveTo(9.32783f, 10.53f, 9f, 11.2623f, 9f, 12.0711f)
        curveTo(9f, 13.6887f, 10.3113f, 15f, 11.9289f, 15f)
        curveTo(12.7377f, 15f, 13.47f, 14.6722f, 14f, 14.1421f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        lineTo(21f, 21f)
        }
        }.build()

        return _viewOffSlash!!
    }

private var _viewOffSlash: ImageVector? = null
