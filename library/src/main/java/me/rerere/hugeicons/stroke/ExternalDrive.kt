package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ExternalDrive: ImageVector
    get() {
        if (_externalDrive != null) {
            return _externalDrive!!
        }
        _externalDrive = ImageVector.Builder(
            name = "ExternalDrive",
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
        moveTo(20f, 14f)
        verticalLineTo(10f)
        curveTo(20f, 6.22876f, 20f, 4.34315f, 18.8973f, 3.17157f)
        curveTo(17.7947f, 2f, 16.02f, 2f, 12.4706f, 2f)
        lineTo(11.5294f, 2f)
        curveTo(7.98001f, 2f, 6.20531f, 2f, 5.10266f, 3.17157f)
        curveTo(4f, 4.34315f, 4f, 6.22876f, 4f, 10f)
        lineTo(4f, 14f)
        curveTo(4f, 17.7712f, 4f, 19.6569f, 5.10266f, 20.8284f)
        curveTo(6.20531f, 22f, 7.98001f, 22f, 11.5294f, 22f)
        horizontalLineTo(12.4706f)
        curveTo(16.02f, 22f, 17.7947f, 22f, 18.8973f, 20.8284f)
        curveTo(20f, 19.6569f, 20f, 17.7712f, 20f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 18f)
        horizontalLineTo(16.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 15f)
        lineTo(20f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 6f)
        lineTo(10f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 9f)
        lineTo(10f, 9f)
        }
        }.build()

        return _externalDrive!!
    }

private var _externalDrive: ImageVector? = null
