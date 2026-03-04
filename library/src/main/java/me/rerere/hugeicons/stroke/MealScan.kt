package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MealScan: ImageVector
    get() {
        if (_mealScan != null) {
            return _mealScan!!
        }
        _mealScan = ImageVector.Builder(
            name = "MealScan",
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
        moveTo(2.5f, 8.18677f)
        curveTo(2.60406f, 6.08705f, 2.91537f, 4.77792f, 3.84664f, 3.84664f)
        curveTo(4.77792f, 2.91537f, 6.08705f, 2.60406f, 8.18677f, 2.5f)
        moveTo(21.5f, 8.18677f)
        curveTo(21.3959f, 6.08705f, 21.0846f, 4.77792f, 20.1534f, 3.84664f)
        curveTo(19.2221f, 2.91537f, 17.9129f, 2.60406f, 15.8132f, 2.5f)
        moveTo(15.8132f, 21.5f)
        curveTo(17.9129f, 21.3959f, 19.2221f, 21.0846f, 20.1534f, 20.1534f)
        curveTo(21.0846f, 19.2221f, 21.3959f, 17.9129f, 21.5f, 15.8132f)
        moveTo(8.18676f, 21.5f)
        curveTo(6.08705f, 21.3959f, 4.77792f, 21.0846f, 3.84664f, 20.1534f)
        curveTo(2.91537f, 19.2221f, 2.60406f, 17.9129f, 2.5f, 15.8132f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.2224f, 8.5f)
        curveTo(15.4446f, 8.5f, 17.0002f, 9.5f, 17.0002f, 11.3366f)
        curveTo(17.0002f, 12.9913f, 16.7224f, 14.1732f, 15.6113f, 15.5915f)
        curveTo(14.7666f, 16.55f, 13.6389f, 16.7903f, 12.4369f, 16.119f)
        lineTo(12.0002f, 15.8963f)
        lineTo(11.5635f, 16.119f)
        curveTo(10.3614f, 16.7903f, 9.23376f, 16.55f, 8.38907f, 15.5915f)
        curveTo(7.27796f, 14.1732f, 7.00018f, 12.9913f, 7.00018f, 11.3366f)
        curveTo(7.00018f, 9.5f, 8.55574f, 8.5f, 9.77796f, 8.5f)
        curveTo(11.0002f, 8.5f, 11.5002f, 9f, 12.0002f, 9.5f)
        curveTo(12.5002f, 9f, 13.0002f, 8.5f, 14.2224f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 6.5f)
        curveTo(12.5f, 7f, 12f, 8f, 12f, 9.5f)
        }
        }.build()

        return _mealScan!!
    }

private var _mealScan: ImageVector? = null
