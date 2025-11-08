package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PowerService: ImageVector
    get() {
        if (_powerService != null) {
            return _powerService!!
        }
        _powerService = ImageVector.Builder(
            name = "PowerService",
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
        moveTo(12.5f, 8f)
        lineTo(10f, 12f)
        horizontalLineTo(14f)
        lineTo(11.5f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.011f, 14.1391f)
        curveTo(21.5329f, 13.9955f, 21.7939f, 13.9237f, 21.8969f, 13.7864f)
        curveTo(22f, 13.6491f, 22f, 13.4282f, 22f, 12.9865f)
        verticalLineTo(11.0136f)
        curveTo(22f, 10.5719f, 22f, 10.351f, 21.8969f, 10.2137f)
        curveTo(21.7938f, 10.0764f, 21.5329f, 10.0046f, 21.011f, 9.86099f)
        curveTo(19.0606f, 9.32431f, 17.8399f, 7.24382f, 18.3433f, 5.26681f)
        curveTo(18.4817f, 4.72311f, 18.5509f, 4.45126f, 18.4848f, 4.29182f)
        curveTo(18.4187f, 4.13238f, 18.2291f, 4.0225f, 17.8497f, 3.80275f)
        lineTo(16.125f, 2.80363f)
        curveTo(15.7528f, 2.588f, 15.5667f, 2.48018f, 15.3997f, 2.50314f)
        curveTo(15.2326f, 2.5261f, 15.0442f, 2.71792f, 14.6672f, 3.10157f)
        curveTo(13.208f, 4.58689f, 10.7936f, 4.58683f, 9.33434f, 3.10147f)
        curveTo(8.95743f, 2.71782f, 8.76898f, 2.526f, 8.60193f, 2.50304f)
        curveTo(8.43489f, 2.48008f, 8.24877f, 2.5879f, 7.87653f, 2.80353f)
        lineTo(6.15184f, 3.80266f)
        curveTo(5.77253f, 4.02239f, 5.58287f, 4.13226f, 5.51678f, 4.29168f)
        curveTo(5.45068f, 4.4511f, 5.51987f, 4.72298f, 5.65825f, 5.26674f)
        curveTo(6.16137f, 7.2438f, 4.93972f, 9.32435f, 2.98902f, 9.86101f)
        curveTo(2.46712f, 10.0046f, 2.20617f, 10.0764f, 2.10308f, 10.2137f)
        curveTo(2f, 10.351f, 2f, 10.5718f, 2f, 11.0136f)
        verticalLineTo(12.9865f)
        curveTo(2f, 13.4282f, 2f, 13.6491f, 2.10308f, 13.7864f)
        curveTo(2.20615f, 13.9237f, 2.46711f, 13.9955f, 2.98902f, 14.1391f)
        curveTo(4.9394f, 14.6758f, 6.16008f, 16.7563f, 5.65672f, 18.7333f)
        curveTo(5.51829f, 19.277f, 5.44907f, 19.5488f, 5.51516f, 19.7083f)
        curveTo(5.58126f, 19.8677f, 5.77092f, 19.9776f, 6.15025f, 20.1973f)
        lineTo(7.87495f, 21.1965f)
        curveTo(8.24721f, 21.4121f, 8.43334f, 21.5199f, 8.6004f, 21.497f)
        curveTo(8.76746f, 21.474f, 8.95588f, 21.2821f, 9.33271f, 20.8985f)
        curveTo(10.7927f, 19.4119f, 13.2088f, 19.4119f, 14.6689f, 20.8984f)
        curveTo(15.0457f, 21.2821f, 15.2341f, 21.4739f, 15.4012f, 21.4969f)
        curveTo(15.5682f, 21.5198f, 15.7544f, 21.412f, 16.1266f, 21.1964f)
        lineTo(17.8513f, 20.1972f)
        curveTo(18.2307f, 19.9775f, 18.4204f, 19.8676f, 18.4864f, 19.7081f)
        curveTo(18.5525f, 19.5487f, 18.4833f, 19.2768f, 18.3448f, 18.7332f)
        curveTo(17.8412f, 16.7563f, 19.0609f, 14.6758f, 21.011f, 14.1391f)
        }
        }.build()

        return _powerService!!
    }

private var _powerService: ImageVector? = null
