package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Speaker01: ImageVector
    get() {
        if (_speaker01 != null) {
            return _speaker01!!
        }
        _speaker01 = ImageVector.Builder(
            name = "Speaker01",
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
        moveTo(3.5f, 10f)
        curveTo(3.5f, 6.22876f, 3.5f, 4.34315f, 4.7448f, 3.17157f)
        curveTo(5.98959f, 2f, 7.99306f, 2f, 12f, 2f)
        curveTo(16.0069f, 2f, 18.0104f, 2f, 19.2552f, 3.17157f)
        curveTo(20.5f, 4.34315f, 20.5f, 6.22876f, 20.5f, 10f)
        verticalLineTo(14f)
        curveTo(20.5f, 17.7712f, 20.5f, 19.6569f, 19.2552f, 20.8284f)
        curveTo(18.0104f, 22f, 16.0069f, 22f, 12f, 22f)
        curveTo(7.99306f, 22f, 5.98959f, 22f, 4.7448f, 20.8284f)
        curveTo(3.5f, 19.6569f, 3.5f, 17.7712f, 3.5f, 14f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 6f)
        horizontalLineTo(14f)
        }
        }.build()

        return _speaker01!!
    }

private var _speaker01: ImageVector? = null
