package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MosqueLocation: ImageVector
    get() {
        if (_mosqueLocation != null) {
            return _mosqueLocation!!
        }
        _mosqueLocation = ImageVector.Builder(
            name = "MosqueLocation",
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
        moveTo(11.0063f, 7.49912f)
        curveTo(10.55f, 6.89215f, 9.82344f, 6.49954f, 9.00514f, 6.49954f)
        curveTo(7.62376f, 6.49954f, 6.50393f, 7.61836f, 6.50393f, 8.99848f)
        curveTo(6.50393f, 10.2075f, 7.36323f, 11.2159f, 8.5049f, 11.4475f)
        moveTo(8.94989f, 17.9947f)
        curveTo(8.69895f, 17.9947f, 8.45232f, 17.9276f, 8.23424f, 17.8002f)
        curveTo(5.24722f, 15.8848f, 2.00175f, 13.1276f, 2.00175f, 9.13903f)
        curveTo(2.00175f, 5.22645f, 5.18975f, 2.00143f, 8.94989f, 2.00143f)
        curveTo(10.9174f, 2.00143f, 12.7281f, 2.88435f, 14.0076f, 4.28671f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.6195f, 15.5501f)
        curveTo(11.2592f, 13.8947f, 11.0271f, 12.2323f, 12.9734f, 10.2138f)
        curveTo(15.018f, 8.38932f, 16.1955f, 7.52647f, 16.5092f, 7.00723f)
        curveTo(16.8228f, 7.52647f, 18.0194f, 8.38932f, 20.0641f, 10.2138f)
        curveTo(21.9171f, 11.8673f, 21.8005f, 13.8947f, 20.4402f, 15.5501f)
        moveTo(12.6195f, 15.5501f)
        horizontalLineTo(12.0973f)
        moveTo(12.6195f, 15.5501f)
        horizontalLineTo(20.4402f)
        moveTo(20.4402f, 15.5501f)
        horizontalLineTo(20.9003f)
        moveTo(11.0271f, 15.5501f)
        horizontalLineTo(12.0973f)
        moveTo(12.0973f, 15.5501f)
        verticalLineTo(21.0928f)
        curveTo(12.1372f, 21.7603f, 12.0973f, 22.0718f, 13.3077f, 21.9843f)
        horizontalLineTo(16.4903f)
        moveTo(20.9003f, 15.5501f)
        horizontalLineTo(21.9987f)
        moveTo(20.9003f, 15.5501f)
        verticalLineTo(21.1943f)
        curveTo(21.017f, 22.1008f, 20.2953f, 21.9418f, 19.8338f, 21.9843f)
        horizontalLineTo(16.4903f)
        moveTo(16.4903f, 21.9843f)
        lineTo(16.5257f, 19.8505f)
        }
        }.build()

        return _mosqueLocation!!
    }

private var _mosqueLocation: ImageVector? = null
