package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AddInvoice: ImageVector
    get() {
        if (_addInvoice != null) {
            return _addInvoice!!
        }
        _addInvoice = ImageVector.Builder(
            name = "AddInvoice",
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
        moveTo(12.06f, 21.5124f)
        curveTo(11.5445f, 21.8375f, 11.2868f, 22f, 11f, 22f)
        curveTo(10.7132f, 22f, 10.4554f, 21.8374f, 9.94f, 21.5124f)
        lineTo(8.02913f, 20.3073f)
        curveTo(7.54415f, 20.0014f, 7.30166f, 19.8485f, 7.03253f, 19.8397f)
        curveTo(6.74172f, 19.8301f, 6.49493f, 19.9768f, 5.97087f, 20.3073f)
        curveTo(5.38395f, 20.6774f, 4.21687f, 21.6971f, 3.46195f, 21.2108f)
        curveTo(3f, 20.9133f, 3f, 20.1575f, 3f, 18.6458f)
        verticalLineTo(8.00002f)
        curveTo(3f, 5.17158f, 3f, 3.75736f, 3.82699f, 2.87868f)
        curveTo(4.65399f, 2f, 5.98501f, 2f, 8.64706f, 2f)
        horizontalLineTo(13.3529f)
        curveTo(16.015f, 2f, 17.346f, 2f, 18.173f, 2.87868f)
        curveTo(19f, 3.75736f, 19f, 5.17158f, 19f, 8.00002f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 11f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 14f)
        verticalLineTo(22f)
        moveTo(21f, 18f)
        lineTo(13f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        lineTo(7f, 7f)
        }
        }.build()

        return _addInvoice!!
    }

private var _addInvoice: ImageVector? = null
