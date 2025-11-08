package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cherry: ImageVector
    get() {
        if (_cherry != null) {
            return _cherry!!
        }
        _cherry = ImageVector.Builder(
            name = "Cherry",
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
        moveTo(22f, 16.5f)
        curveTo(22f, 19.5376f, 19.5376f, 22f, 16.5f, 22f)
        curveTo(13.4624f, 22f, 11f, 19.5376f, 11f, 16.5f)
        curveTo(11f, 13.4624f, 13.4624f, 11f, 16.5f, 11f)
        curveTo(19.5376f, 11f, 22f, 13.4624f, 22f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 11f)
        curveTo(9.62217f, 10.37f, 8.55171f, 10f, 7.39646f, 10f)
        curveTo(4.41608f, 10f, 2f, 12.4624f, 2f, 15.5f)
        curveTo(2f, 18.5376f, 4.41608f, 21f, 7.39646f, 21f)
        curveTo(8.08877f, 21f, 8.75062f, 20.8671f, 9.35882f, 20.6251f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13f)
        curveTo(14.1631f, 11.1035f, 11.7291f, 7.13692f, 13.7946f, 4f)
        moveTo(16f, 2f)
        curveTo(14.9847f, 2.59904f, 14.2703f, 3.27752f, 13.7946f, 4f)
        moveTo(13.7946f, 4f)
        curveTo(11.4006f, 4.5f, 6.09142f, 6.5f, 7.13408f, 12f)
        }
        }.build()

        return _cherry!!
    }

private var _cherry: ImageVector? = null
