package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RestaurantTable: ImageVector
    get() {
        if (_restaurantTable != null) {
            return _restaurantTable!!
        }
        _restaurantTable = ImageVector.Builder(
            name = "RestaurantTable",
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
        moveTo(6f, 17f)
        curveTo(4.5f, 17f, 4.5f, 16f, 3f, 16f)
        lineTo(4.17111f, 11.9011f)
        curveTo(4.57006f, 10.5048f, 4.76954f, 9.80661f, 5.30421f, 9.4033f)
        curveTo(5.83888f, 9f, 6.56499f, 9f, 8.01721f, 9f)
        horizontalLineTo(15.9828f)
        curveTo(17.435f, 9f, 18.1611f, 9f, 18.6958f, 9.4033f)
        curveTo(19.2305f, 9.80661f, 19.4299f, 10.5048f, 19.8289f, 11.9011f)
        lineTo(21f, 16f)
        curveTo(19.5f, 16f, 19.5f, 17f, 18f, 17f)
        curveTo(16.5f, 17f, 16.5f, 16f, 15f, 16f)
        curveTo(13.5f, 16f, 13.5f, 17f, 12f, 17f)
        curveTo(10.5f, 17f, 10.5f, 16f, 9f, 16f)
        curveTo(7.5f, 16f, 7.5f, 17f, 6f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        verticalLineTo(8f)
        curveTo(8f, 5.79086f, 9.79086f, 4f, 12f, 4f)
        moveTo(16f, 9f)
        verticalLineTo(8f)
        curveTo(16f, 5.79086f, 14.2091f, 4f, 12f, 4f)
        moveTo(12f, 4f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        verticalLineTo(21f)
        moveTo(12f, 21f)
        horizontalLineTo(14f)
        moveTo(12f, 21f)
        horizontalLineTo(10f)
        }
        }.build()

        return _restaurantTable!!
    }

private var _restaurantTable: ImageVector? = null
