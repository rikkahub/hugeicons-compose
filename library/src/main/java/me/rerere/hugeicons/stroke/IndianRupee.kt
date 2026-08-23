package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.IndianRupee: ImageVector
    get() {
        if (_indianRupee != null) {
            return _indianRupee!!
        }
        _indianRupee = ImageVector.Builder(
            name = "IndianRupee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 3f)
            horizontalLineTo(9f)
            curveTo(11.7614f, 3f, 14f, 5.23858f, 14f, 8f)
            curveTo(14f, 10.7614f, 11.7614f, 13f, 9f, 13f)
            curveTo(7.75179f, 13f, 7.12769f, 13f, 6.86036f, 13.2016f)
            curveTo(6.53165f, 13.4496f, 6.38851f, 13.8737f, 6.49971f, 14.2701f)
            curveTo(6.59015f, 14.5925f, 7.08659f, 14.9707f, 8.07944f, 15.7272f)
            lineTo(15f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 3f)
            horizontalLineTo(18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 8f)
            horizontalLineTo(18f)
        }
        }.build()

        return _indianRupee!!
    }

private var _indianRupee: ImageVector? = null
