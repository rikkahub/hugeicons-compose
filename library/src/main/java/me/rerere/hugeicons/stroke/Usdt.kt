package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Usdt: ImageVector
    get() {
        if (_usdt != null) {
            return _usdt!!
        }
        _usdt = ImageVector.Builder(
            name = "Usdt",
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
        moveTo(13.5f, 9.02234f)
        curveTo(18.3113f, 9.16708f, 22f, 9.99738f, 22f, 11f)
        curveTo(22f, 12.1046f, 17.5228f, 13f, 12f, 13f)
        curveTo(6.47715f, 13f, 2f, 12.1046f, 2f, 11f)
        curveTo(2f, 9.99738f, 5.68874f, 9.16708f, 10.5f, 9.02234f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 10.4776f)
        verticalLineTo(8f)
        curveTo(13.5f, 7.05719f, 13.5f, 6.58579f, 13.7929f, 6.29289f)
        curveTo(14.0858f, 6f, 14.5572f, 6f, 15.5f, 6f)
        horizontalLineTo(18f)
        curveTo(18.4659f, 6f, 18.6989f, 6f, 18.8827f, 5.92388f)
        curveTo(19.1277f, 5.82239f, 19.3224f, 5.62771f, 19.4239f, 5.38268f)
        curveTo(19.5f, 5.19891f, 19.5f, 4.96594f, 19.5f, 4.5f)
        curveTo(19.5f, 4.03406f, 19.5f, 3.80109f, 19.4239f, 3.61732f)
        curveTo(19.3224f, 3.37229f, 19.1277f, 3.17761f, 18.8827f, 3.07612f)
        curveTo(18.6989f, 3f, 18.4659f, 3f, 18f, 3f)
        horizontalLineTo(6f)
        curveTo(5.53406f, 3f, 5.30109f, 3f, 5.11732f, 3.07612f)
        curveTo(4.87229f, 3.17761f, 4.67761f, 3.37229f, 4.57612f, 3.61732f)
        curveTo(4.5f, 3.80109f, 4.5f, 4.03406f, 4.5f, 4.5f)
        curveTo(4.5f, 4.96594f, 4.5f, 5.19891f, 4.57612f, 5.38268f)
        curveTo(4.67761f, 5.62771f, 4.87229f, 5.82239f, 5.11732f, 5.92388f)
        curveTo(5.30109f, 6f, 5.53406f, 6f, 6f, 6f)
        horizontalLineTo(8.5f)
        curveTo(9.44281f, 6f, 9.91421f, 6f, 10.2071f, 6.29289f)
        curveTo(10.5f, 6.58579f, 10.5f, 7.05719f, 10.5f, 8f)
        verticalLineTo(10.4776f)
        moveTo(13.5f, 12.9776f)
        verticalLineTo(19.5f)
        curveTo(13.5f, 19.9659f, 13.5f, 20.1989f, 13.4239f, 20.3827f)
        curveTo(13.3224f, 20.6277f, 13.1277f, 20.8224f, 12.8827f, 20.9239f)
        curveTo(12.6989f, 21f, 12.4659f, 21f, 12f, 21f)
        curveTo(11.5341f, 21f, 11.3011f, 21f, 11.1173f, 20.9239f)
        curveTo(10.8723f, 20.8224f, 10.6776f, 20.6277f, 10.5761f, 20.3827f)
        curveTo(10.5f, 20.1989f, 10.5f, 19.9659f, 10.5f, 19.5f)
        verticalLineTo(12.9776f)
        }
        }.build()

        return _usdt!!
    }

private var _usdt: ImageVector? = null
