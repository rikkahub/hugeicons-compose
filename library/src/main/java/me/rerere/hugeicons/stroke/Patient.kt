package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Patient: ImageVector
    get() {
        if (_patient != null) {
            return _patient!!
        }
        _patient = ImageVector.Builder(
            name = "Patient",
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
        moveTo(20f, 21.9999f)
        verticalLineTo(18.9999f)
        curveTo(20f, 16.1715f, 20f, 14.7572f, 19.1213f, 13.8786f)
        curveTo(18.2426f, 12.9999f, 16.8284f, 12.9999f, 14f, 12.9999f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 12.9999f, 5.75736f, 12.9999f, 4.87868f, 13.8786f)
        curveTo(4f, 14.7572f, 4f, 16.1715f, 4f, 18.9999f)
        curveTo(4f, 19.9318f, 4f, 20.3977f, 4.15224f, 20.7652f)
        curveTo(4.35523f, 21.2553f, 4.74458f, 21.6446f, 5.23463f, 21.8476f)
        curveTo(5.60218f, 21.9999f, 6.06812f, 21.9999f, 7f, 21.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 12.9999f)
        lineTo(12.5f, 21.9999f)
        moveTo(7f, 13.4999f)
        verticalLineTo(21.9999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18.9999f)
        horizontalLineTo(14.5f)
        curveTo(15.3284f, 18.9999f, 16f, 19.6715f, 16f, 20.4999f)
        curveTo(16f, 21.3283f, 15.3284f, 21.9999f, 14.5f, 21.9999f)
        horizontalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 6.49997f)
        verticalLineTo(5.49997f)
        curveTo(15.5f, 3.56697f, 13.933f, 1.99997f, 12f, 1.99997f)
        curveTo(10.067f, 1.99997f, 8.5f, 3.56697f, 8.5f, 5.49997f)
        verticalLineTo(6.49997f)
        curveTo(8.5f, 8.43297f, 10.067f, 9.99997f, 12f, 9.99997f)
        curveTo(13.933f, 9.99997f, 15.5f, 8.43297f, 15.5f, 6.49997f)
        }
        }.build()

        return _patient!!
    }

private var _patient: ImageVector? = null
