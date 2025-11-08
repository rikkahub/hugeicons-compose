package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Invoice01: ImageVector
    get() {
        if (_invoice01 != null) {
            return _invoice01!!
        }
        _invoice01 = ImageVector.Builder(
            name = "Invoice01",
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
        moveTo(4f, 18.6458f)
        verticalLineTo(8.05426f)
        curveTo(4f, 5.20025f, 4f, 3.77325f, 4.87868f, 2.88663f)
        curveTo(5.75736f, 2f, 7.17157f, 2f, 10f, 2f)
        horizontalLineTo(14f)
        curveTo(16.8284f, 2f, 18.2426f, 2f, 19.1213f, 2.88663f)
        curveTo(20f, 3.77325f, 20f, 5.20025f, 20f, 8.05426f)
        verticalLineTo(18.6458f)
        curveTo(20f, 20.1575f, 20f, 20.9133f, 19.538f, 21.2108f)
        curveTo(18.7831f, 21.6971f, 17.6161f, 20.6774f, 17.0291f, 20.3073f)
        curveTo(16.5441f, 20.0014f, 16.3017f, 19.8485f, 16.0325f, 19.8397f)
        curveTo(15.7417f, 19.8301f, 15.4949f, 19.9768f, 14.9709f, 20.3073f)
        lineTo(13.06f, 21.5124f)
        curveTo(12.5445f, 21.8374f, 12.2868f, 22f, 12f, 22f)
        curveTo(11.7132f, 22f, 11.4555f, 21.8374f, 10.94f, 21.5124f)
        lineTo(9.02913f, 20.3073f)
        curveTo(8.54415f, 20.0014f, 8.30166f, 19.8485f, 8.03253f, 19.8397f)
        curveTo(7.74172f, 19.8301f, 7.49493f, 19.9768f, 6.97087f, 20.3073f)
        curveTo(6.38395f, 20.6774f, 5.21687f, 21.6971f, 4.46195f, 21.2108f)
        curveTo(4f, 20.9133f, 4f, 20.1575f, 4f, 18.6458f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 11f)
        horizontalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 7f)
        lineTo(8f, 7f)
        }
        }.build()

        return _invoice01!!
    }

private var _invoice01: ImageVector? = null
