package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChevronDoubleClose: ImageVector
    get() {
        if (_chevronDoubleClose != null) {
            return _chevronDoubleClose!!
        }
        _chevronDoubleClose = ImageVector.Builder(
            name = "ChevronDoubleClose",
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
        moveTo(8.99995f, 7f)
        lineTo(6.62858f, 8.92711f)
        curveTo(4.87619f, 10.3512f, 4f, 11.0633f, 4f, 12f)
        curveTo(4f, 12.9367f, 4.8762f, 13.6488f, 6.62859f, 15.0729f)
        lineTo(9f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        lineTo(17.3714f, 8.92711f)
        curveTo(19.1238f, 10.3512f, 20f, 11.0633f, 20f, 12f)
        curveTo(20f, 12.9367f, 19.1238f, 13.6488f, 17.3714f, 15.0729f)
        lineTo(15f, 17f)
        }
        }.build()

        return _chevronDoubleClose!!
    }

private var _chevronDoubleClose: ImageVector? = null
