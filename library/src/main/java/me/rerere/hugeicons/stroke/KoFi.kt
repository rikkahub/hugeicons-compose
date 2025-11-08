package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.KoFi: ImageVector
    get() {
        if (_koFi != null) {
            return _koFi!!
        }
        _koFi = ImageVector.Builder(
            name = "KoFi",
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
        moveTo(17f, 5.5f)
        horizontalLineTo(4f)
        curveTo(3.05719f, 5.5f, 2.58579f, 5.5f, 2.29289f, 5.79289f)
        curveTo(2f, 6.08579f, 2f, 6.55719f, 2f, 7.5f)
        verticalLineTo(14.5f)
        curveTo(2f, 16.3856f, 2f, 17.3284f, 2.58579f, 17.9142f)
        curveTo(3.17157f, 18.5f, 4.11438f, 18.5f, 6f, 18.5f)
        horizontalLineTo(13f)
        curveTo(13.9319f, 18.5f, 14.3978f, 18.5f, 14.7654f, 18.3478f)
        curveTo(15.2554f, 18.1448f, 15.6448f, 17.7554f, 15.8478f, 17.2654f)
        curveTo(16f, 16.8978f, 16f, 16.4319f, 16f, 15.5f)
        horizontalLineTo(17f)
        curveTo(19.7614f, 15.5f, 22f, 13.2614f, 22f, 10.5f)
        curveTo(22f, 7.73858f, 19.7614f, 5.5f, 17f, 5.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 13f)
        horizontalLineTo(16f)
        verticalLineTo(8f)
        horizontalLineTo(17f)
        curveTo(18.3807f, 8f, 19.5f, 9.11929f, 19.5f, 10.5f)
        curveTo(19.5f, 11.8807f, 18.3807f, 13f, 17f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.58579f, 9.10051f)
        curveTo(6.36683f, 8.29983f, 7.63317f, 8.29983f, 8.41421f, 9.10051f)
        lineTo(9f, 9.70101f)
        lineTo(9.58579f, 9.10051f)
        curveTo(10.3668f, 8.29983f, 11.6332f, 8.29983f, 12.4142f, 9.10051f)
        curveTo(13.1953f, 9.90118f, 13.1953f, 11.1993f, 12.4142f, 12f)
        lineTo(9f, 15.5f)
        lineTo(5.58579f, 12f)
        curveTo(4.80474f, 11.1993f, 4.80474f, 9.90118f, 5.58579f, 9.10051f)
        }
        }.build()

        return _koFi!!
    }

private var _koFi: ImageVector? = null
