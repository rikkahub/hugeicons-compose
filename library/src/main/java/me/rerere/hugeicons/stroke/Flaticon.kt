package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flaticon: ImageVector
    get() {
        if (_flaticon != null) {
            return _flaticon!!
        }
        _flaticon = ImageVector.Builder(
            name = "Flaticon",
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
        moveTo(4.4235f, 10.2502f)
        lineTo(9.61532f, 19.0797f)
        lineTo(9.61533f, 19.0797f)
        curveTo(10.1023f, 19.9079f, 10.3458f, 20.322f, 10.6054f, 20.5488f)
        curveTo(11.296f, 21.1523f, 12.2368f, 21.1502f, 12.9255f, 20.5437f)
        curveTo(13.1844f, 20.3157f, 13.4266f, 19.9006f, 13.911f, 19.0703f)
        lineTo(10.2334f, 12.955f)
        lineTo(12.0899f, 9.74998f)
        horizontalLineTo(8.30599f)
        lineTo(6.6712f, 7.03158f)
        lineTo(13.6646f, 7.03158f)
        lineTo(16f, 3f)
        lineTo(7.60332f, 3.00004f)
        curveTo(4.33248f, 3.00004f, 2.69707f, 3.00004f, 2.15323f, 4.24003f)
        curveTo(1.60939f, 5.48002f, 2.54743f, 7.07009f, 4.4235f, 10.2502f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.8349f, 4.22015f)
        curveTo(22.4209f, 5.50363f, 21.4101f, 7.14947f, 19.3883f, 10.4412f)
        lineTo(15.3729f, 17f)
        lineTo(13f, 13.2101f)
        lineTo(19.1577f, 3f)
        curveTo(20.621f, 3.10933f, 21.4638f, 3.40743f, 21.8349f, 4.22015f)
        }
        }.build()

        return _flaticon!!
    }

private var _flaticon: ImageVector? = null
