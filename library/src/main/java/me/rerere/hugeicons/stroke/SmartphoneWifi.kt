package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartphoneWifi: ImageVector
    get() {
        if (_smartphoneWifi != null) {
            return _smartphoneWifi!!
        }
        _smartphoneWifi = ImageVector.Builder(
            name = "SmartphoneWifi",
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
        moveTo(8f, 6f)
        curveTo(6.37274f, 6.02975f, 5.43781f, 6.1682f, 4.80546f, 6.81237f)
        curveTo(4f, 7.63289f, 4f, 8.9535f, 4f, 11.5947f)
        verticalLineTo(16.3971f)
        curveTo(4f, 19.0384f, 4f, 20.359f, 4.80546f, 21.1795f)
        curveTo(5.61091f, 22f, 6.90728f, 22f, 9.5f, 22f)
        curveTo(12.0927f, 22f, 13.3891f, 22f, 14.1945f, 21.1795f)
        curveTo(15f, 20.359f, 15f, 19.0384f, 15f, 16.3971f)
        verticalLineTo(13.4958f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 19f)
        horizontalLineTo(9.50898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 3.8472f)
        curveTo(11.436f, 2.67893f, 13.1511f, 2f, 14.9932f, 2f)
        curveTo(16.8411f, 2f, 18.5612f, 2.68322f, 20f, 3.85827f)
        moveTo(17.7178f, 7f)
        curveTo(16.8977f, 6.48859f, 15.9724f, 6.20085f, 14.9932f, 6.20085f)
        curveTo(14.019f, 6.20085f, 13.098f, 6.4857f, 12.281f, 6.99231f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        horizontalLineTo(15.0064f)
        }
        }.build()

        return _smartphoneWifi!!
    }

private var _smartphoneWifi: ImageVector? = null
