package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CouponPercent: ImageVector
    get() {
        if (_couponPercent != null) {
            return _couponPercent!!
        }
        _couponPercent = ImageVector.Builder(
            name = "CouponPercent",
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
        moveTo(2.46439f, 9.34375f)
        curveTo(2.21585f, 9.34375f, 1.98905f, 9.14229f, 2.00048f, 8.87895f)
        curveTo(2.06739f, 7.33687f, 2.25487f, 6.33298f, 2.78014f, 5.53884f)
        curveTo(3.08234f, 5.08196f, 3.45771f, 4.68459f, 3.88929f, 4.36468f)
        curveTo(5.05581f, 3.5f, 6.70145f, 3.5f, 9.99272f, 3.5f)
        horizontalLineTo(14.0074f)
        curveTo(17.2987f, 3.5f, 18.9443f, 3.5f, 20.1109f, 4.36468f)
        curveTo(20.5424f, 4.68459f, 20.9178f, 5.08196f, 21.22f, 5.53884f)
        curveTo(21.7452f, 6.33289f, 21.9327f, 7.33665f, 21.9996f, 8.87843f)
        curveTo(22.0111f, 9.14208f, 21.784f, 9.34375f, 21.5352f, 9.34375f)
        curveTo(20.1494f, 9.34375f, 19.026f, 10.533f, 19.026f, 12f)
        curveTo(19.026f, 13.467f, 20.1494f, 14.6562f, 21.5352f, 14.6562f)
        curveTo(21.784f, 14.6562f, 22.0111f, 14.8579f, 21.9996f, 15.1216f)
        curveTo(21.9327f, 16.6634f, 21.7452f, 17.6671f, 21.22f, 18.4612f)
        curveTo(20.9178f, 18.918f, 20.5424f, 19.3154f, 20.1109f, 19.6353f)
        curveTo(18.9443f, 20.5f, 17.2987f, 20.5f, 14.0074f, 20.5f)
        horizontalLineTo(9.99272f)
        curveTo(6.70145f, 20.5f, 5.05581f, 20.5f, 3.88929f, 19.6353f)
        curveTo(3.45771f, 19.3154f, 3.08234f, 18.918f, 2.78014f, 18.4612f)
        curveTo(2.25487f, 17.667f, 2.06739f, 16.6631f, 2.00048f, 15.1211f)
        curveTo(1.98905f, 14.8577f, 2.21585f, 14.6562f, 2.46439f, 14.6562f)
        curveTo(3.85018f, 14.6562f, 4.97358f, 13.467f, 4.97358f, 12f)
        curveTo(4.97358f, 10.533f, 3.85018f, 9.34375f, 2.46439f, 9.34375f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50006f, 14.5f)
        lineTo(14.5001f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.50006f, 9.5f)
        horizontalLineTo(9.51129f)
        moveTo(14.4888f, 14.5f)
        horizontalLineTo(14.5001f)
        }
        }.build()

        return _couponPercent!!
    }

private var _couponPercent: ImageVector? = null
