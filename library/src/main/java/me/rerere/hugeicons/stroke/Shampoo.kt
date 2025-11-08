package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Shampoo: ImageVector
    get() {
        if (_shampoo != null) {
            return _shampoo!!
        }
        _shampoo = ImageVector.Builder(
            name = "Shampoo",
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
        moveTo(7f, 13f)
        curveTo(7f, 10.2386f, 9.23858f, 8f, 12f, 8f)
        curveTo(14.7614f, 8f, 17f, 10.2386f, 17f, 13f)
        verticalLineTo(18f)
        curveTo(17f, 19.8856f, 17f, 20.8284f, 16.4142f, 21.4142f)
        curveTo(15.8284f, 22f, 14.8856f, 22f, 13f, 22f)
        horizontalLineTo(11f)
        curveTo(9.11438f, 22f, 8.17157f, 22f, 7.58579f, 21.4142f)
        curveTo(7f, 20.8284f, 7f, 19.8856f, 7f, 18f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        verticalLineTo(7f)
        curveTo(10f, 6.05719f, 10f, 5.58579f, 10.2929f, 5.29289f)
        curveTo(10.5858f, 5f, 11.0572f, 5f, 12f, 5f)
        curveTo(12.9428f, 5f, 13.4142f, 5f, 13.7071f, 5.29289f)
        curveTo(14f, 5.58579f, 14f, 6.05719f, 14f, 7f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        verticalLineTo(2f)
        moveTo(12f, 2f)
        horizontalLineTo(10f)
        moveTo(12f, 2f)
        horizontalLineTo(14.745f)
        curveTo(15.5022f, 2f, 16.2315f, 2.28636f, 16.7864f, 2.80162f)
        lineTo(17f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 13f)
        horizontalLineTo(17f)
        }
        }.build()

        return _shampoo!!
    }

private var _shampoo: ImageVector? = null
