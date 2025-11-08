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
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5063f, 7.49912f)
        curveTo(11.05f, 6.89215f, 10.3234f, 6.49954f, 9.50512f, 6.49954f)
        curveTo(8.12375f, 6.49954f, 7.00391f, 7.61836f, 7.00391f, 8.99848f)
        curveTo(7.00391f, 10.2075f, 7.86321f, 11.2159f, 9.00488f, 11.4475f)
        moveTo(9.44988f, 17.9947f)
        curveTo(9.19894f, 17.9947f, 8.95231f, 17.9276f, 8.73422f, 17.8002f)
        curveTo(5.74721f, 15.8848f, 2.50174f, 13.1276f, 2.50174f, 9.13903f)
        curveTo(2.50174f, 5.22645f, 5.68973f, 2.00143f, 9.44988f, 2.00143f)
        curveTo(11.4173f, 2.00143f, 13.2281f, 2.88435f, 14.5075f, 4.28671f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.1195f, 15.5501f)
        curveTo(11.7592f, 13.8947f, 11.5271f, 12.2323f, 13.4734f, 10.2138f)
        curveTo(15.518f, 8.38932f, 16.6955f, 7.52647f, 17.0091f, 7.00723f)
        curveTo(17.3228f, 7.52647f, 18.5194f, 8.38932f, 20.564f, 10.2138f)
        curveTo(22.4171f, 11.8673f, 22.3005f, 13.8947f, 20.9402f, 15.5501f)
        moveTo(13.1195f, 15.5501f)
        horizontalLineTo(12.5973f)
        moveTo(13.1195f, 15.5501f)
        horizontalLineTo(20.9402f)
        moveTo(20.9402f, 15.5501f)
        horizontalLineTo(21.4003f)
        moveTo(11.5271f, 15.5501f)
        horizontalLineTo(12.5973f)
        moveTo(12.5973f, 15.5501f)
        verticalLineTo(21.0928f)
        curveTo(12.6372f, 21.7603f, 12.5973f, 22.0718f, 13.8077f, 21.9843f)
        horizontalLineTo(16.9903f)
        moveTo(21.4003f, 15.5501f)
        horizontalLineTo(22.4987f)
        moveTo(21.4003f, 15.5501f)
        verticalLineTo(21.1943f)
        curveTo(21.517f, 22.1008f, 20.7953f, 21.9418f, 20.3338f, 21.9843f)
        horizontalLineTo(16.9903f)
        moveTo(16.9903f, 21.9843f)
        lineTo(17.0256f, 19.8505f)
        }
        }.build()

        return _mosqueLocation!!
    }

private var _mosqueLocation: ImageVector? = null
