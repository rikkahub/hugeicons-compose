package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Fridge: ImageVector
    get() {
        if (_fridge != null) {
            return _fridge!!
        }
        _fridge = ImageVector.Builder(
            name = "Fridge",
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
        moveTo(12f, 2f)
        curveTo(15.7712f, 2f, 17.6569f, 2f, 18.8284f, 3.17157f)
        curveTo(20f, 4.34315f, 20f, 6.22876f, 20f, 10f)
        verticalLineTo(14f)
        curveTo(20f, 17.7712f, 20f, 19.6569f, 18.8284f, 20.8284f)
        curveTo(17.6569f, 22f, 15.7712f, 22f, 12f, 22f)
        curveTo(8.22876f, 22f, 6.34315f, 22f, 5.17157f, 20.8284f)
        curveTo(4f, 19.6569f, 4f, 17.7712f, 4f, 14f)
        lineTo(4f, 10f)
        curveTo(4f, 6.22876f, 4f, 4.34315f, 5.17157f, 3.17157f)
        curveTo(6.34315f, 2f, 8.22876f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 10f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 6f)
        horizontalLineTo(8.00898f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        lineTo(8f, 14f)
        }
        }.build()

        return _fridge!!
    }

private var _fridge: ImageVector? = null
