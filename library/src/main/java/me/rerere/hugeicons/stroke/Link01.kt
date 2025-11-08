package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Link01: ImageVector
    get() {
        if (_link01 != null) {
            return _link01!!
        }
        _link01 = ImageVector.Builder(
            name = "Link01",
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
        moveTo(9.14339f, 10.691f)
        lineTo(9.35031f, 10.4841f)
        curveTo(11.329f, 8.50532f, 14.5372f, 8.50532f, 16.5159f, 10.4841f)
        curveTo(18.4947f, 12.4628f, 18.4947f, 15.671f, 16.5159f, 17.6497f)
        lineTo(13.6497f, 20.5159f)
        curveTo(11.671f, 22.4947f, 8.46279f, 22.4947f, 6.48405f, 20.5159f)
        curveTo(4.50532f, 18.5372f, 4.50532f, 15.329f, 6.48405f, 13.3503f)
        lineTo(6.9484f, 12.886f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.0516f, 11.114f)
        lineTo(17.5159f, 10.6497f)
        curveTo(19.4947f, 8.67095f, 19.4947f, 5.46279f, 17.5159f, 3.48405f)
        curveTo(15.5372f, 1.50532f, 12.329f, 1.50532f, 10.3503f, 3.48405f)
        lineTo(7.48405f, 6.35031f)
        curveTo(5.50532f, 8.32904f, 5.50532f, 11.5372f, 7.48405f, 13.5159f)
        curveTo(9.46279f, 15.4947f, 12.671f, 15.4947f, 14.6497f, 13.5159f)
        lineTo(14.8566f, 13.309f)
        }
        }.build()

        return _link01!!
    }

private var _link01: ImageVector? = null
