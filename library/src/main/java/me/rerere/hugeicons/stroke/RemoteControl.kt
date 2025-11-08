package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RemoteControl: ImageVector
    get() {
        if (_remoteControl != null) {
            return _remoteControl!!
        }
        _remoteControl = ImageVector.Builder(
            name = "RemoteControl",
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
        moveTo(12.5f, 2f)
        curveTo(15.7998f, 2f, 17.4497f, 2f, 18.4749f, 3.02513f)
        curveTo(19.5f, 4.05025f, 19.5f, 5.70017f, 19.5f, 9f)
        verticalLineTo(15f)
        curveTo(19.5f, 18.2998f, 19.5f, 19.9497f, 18.4749f, 20.9749f)
        curveTo(17.4497f, 22f, 15.7998f, 22f, 12.5f, 22f)
        horizontalLineTo(11.5f)
        curveTo(8.20017f, 22f, 6.55025f, 22f, 5.52513f, 20.9749f)
        curveTo(4.5f, 19.9497f, 4.5f, 18.2998f, 4.5f, 15f)
        lineTo(4.5f, 9f)
        curveTo(4.5f, 5.70017f, 4.5f, 4.05025f, 5.52513f, 3.02513f)
        curveTo(6.55025f, 2f, 8.20017f, 2f, 11.5f, 2f)
        lineTo(12.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 15f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18f)
        horizontalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 15f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 18f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 8f)
        curveTo(15f, 9.65685f, 13.6569f, 11f, 12f, 11f)
        curveTo(10.3431f, 11f, 9f, 9.65685f, 9f, 8f)
        curveTo(9f, 6.34315f, 10.3431f, 5f, 12f, 5f)
        curveTo(13.6569f, 5f, 15f, 6.34315f, 15f, 8f)
        }
        }.build()

        return _remoteControl!!
    }

private var _remoteControl: ImageVector? = null
