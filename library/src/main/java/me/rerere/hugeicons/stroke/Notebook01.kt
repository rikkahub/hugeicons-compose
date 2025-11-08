package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Notebook01: ImageVector
    get() {
        if (_notebook01 != null) {
            return _notebook01!!
        }
        _notebook01 = ImageVector.Builder(
            name = "Notebook01",
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
        moveTo(22f, 14f)
        verticalLineTo(10f)
        curveTo(22f, 6.22876f, 22f, 4.34315f, 20.8284f, 3.17157f)
        curveTo(19.6569f, 2f, 17.7712f, 2f, 14f, 2f)
        horizontalLineTo(12f)
        curveTo(8.22876f, 2f, 6.34315f, 2f, 5.17157f, 3.17157f)
        curveTo(4f, 4.34315f, 4f, 6.22876f, 4f, 10f)
        verticalLineTo(14f)
        curveTo(4f, 17.7712f, 4f, 19.6569f, 5.17157f, 20.8284f)
        curveTo(6.34315f, 22f, 8.22876f, 22f, 12f, 22f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 22f, 19.6569f, 22f, 20.8284f, 20.8284f)
        curveTo(22f, 19.6569f, 22f, 17.7712f, 22f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.7857f, 10f)
        horizontalLineTo(15.2143f)
        curveTo(16.2918f, 10f, 16.8305f, 10f, 17.1653f, 9.70711f)
        curveTo(17.5f, 9.41421f, 17.5f, 8.94281f, 17.5f, 8f)
        curveTo(17.5f, 7.05719f, 17.5f, 6.58579f, 17.1653f, 6.29289f)
        curveTo(16.8305f, 6f, 16.2918f, 6f, 15.2143f, 6f)
        horizontalLineTo(11.7857f)
        curveTo(10.7082f, 6f, 10.1695f, 6f, 9.83474f, 6.29289f)
        curveTo(9.5f, 6.58579f, 9.5f, 7.05719f, 9.5f, 8f)
        curveTo(9.5f, 8.94281f, 9.5f, 9.41421f, 9.83474f, 9.70711f)
        curveTo(10.1695f, 10f, 10.7082f, 10f, 11.7857f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 6f)
        lineTo(2f, 6f)
        moveTo(5f, 12f)
        horizontalLineTo(2f)
        moveTo(5f, 18f)
        horizontalLineTo(2f)
        }
        }.build()

        return _notebook01!!
    }

private var _notebook01: ImageVector? = null
