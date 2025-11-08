package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Anonymous: ImageVector
    get() {
        if (_anonymous != null) {
            return _anonymous!!
        }
        _anonymous = ImageVector.Builder(
            name = "Anonymous",
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
        moveTo(7f, 14.9999f)
        curveTo(5.34315f, 14.9999f, 4f, 16.343f, 4f, 17.9999f)
        curveTo(4f, 19.6567f, 5.34315f, 20.9999f, 7f, 20.9999f)
        curveTo(8.65685f, 20.9999f, 10f, 19.6567f, 10f, 17.9999f)
        curveTo(10f, 16.343f, 8.65685f, 14.9999f, 7f, 14.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14.9999f)
        curveTo(15.3431f, 14.9999f, 14f, 16.343f, 14f, 17.9999f)
        curveTo(14f, 19.6567f, 15.3431f, 20.9999f, 17f, 20.9999f)
        curveTo(18.6569f, 20.9999f, 20f, 19.6567f, 20f, 17.9999f)
        curveTo(20f, 16.343f, 18.6569f, 14.9999f, 17f, 14.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 17f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12.9999f)
        curveTo(19.5434f, 11.7724f, 15.9734f, 10.9999f, 12f, 10.9999f)
        curveTo(8.02658f, 10.9999f, 4.45659f, 11.7724f, 2f, 12.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11.4999f)
        lineTo(17.9425f, 4.71233f)
        curveTo(17.7268f, 3.32807f, 16.2232f, 2.578f, 15.0093f, 3.24907f)
        lineTo(14.3943f, 3.58903f)
        curveTo(12.9019f, 4.414f, 11.0981f, 4.414f, 9.60574f, 3.58903f)
        lineTo(8.99074f, 3.24907f)
        curveTo(7.77676f, 2.578f, 6.27318f, 3.32808f, 6.05751f, 4.71233f)
        lineTo(5f, 11.4999f)
        }
        }.build()

        return _anonymous!!
    }

private var _anonymous: ImageVector? = null
