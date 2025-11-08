package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiVoice: ImageVector
    get() {
        if (_aiVoice != null) {
            return _aiVoice!!
        }
        _aiVoice = ImageVector.Builder(
            name = "AiVoice",
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
        moveTo(9f, 11f)
        verticalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 3f)
        curveTo(7.27027f, 3f, 5.1554f, 3f, 3.75276f, 4.19797f)
        curveTo(3.55358f, 4.36808f, 3.36808f, 4.55358f, 3.19797f, 4.75276f)
        curveTo(2f, 6.1554f, 2f, 8.27027f, 2f, 12.5f)
        curveTo(2f, 16.7297f, 2f, 18.8446f, 3.19797f, 20.2472f)
        curveTo(3.36808f, 20.4464f, 3.55358f, 20.6319f, 3.75276f, 20.802f)
        curveTo(5.1554f, 22f, 7.27027f, 22f, 11.5f, 22f)
        curveTo(15.7297f, 22f, 17.8446f, 22f, 19.2472f, 20.802f)
        curveTo(19.4464f, 20.6319f, 19.6319f, 20.4464f, 19.802f, 20.2472f)
        curveTo(21f, 18.8446f, 21f, 16.7297f, 21f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.3881f, 5.08714f)
        curveTo(16.796f, 4.91193f, 17.9119f, 3.79602f, 18.0871f, 2.38812f)
        curveTo(18.1137f, 2.17498f, 18.2852f, 2f, 18.5f, 2f)
        curveTo(18.7148f, 2f, 18.8863f, 2.17498f, 18.9129f, 2.38812f)
        curveTo(19.0881f, 3.79602f, 20.204f, 4.91193f, 21.6119f, 5.08714f)
        curveTo(21.825f, 5.11366f, 22f, 5.28522f, 22f, 5.5f)
        curveTo(22f, 5.71478f, 21.825f, 5.88634f, 21.6119f, 5.91286f)
        curveTo(20.204f, 6.08807f, 19.0881f, 7.20398f, 18.9129f, 8.61188f)
        curveTo(18.8863f, 8.82502f, 18.7148f, 9f, 18.5f, 9f)
        curveTo(18.2852f, 9f, 18.1137f, 8.82502f, 18.0871f, 8.61188f)
        curveTo(17.9119f, 7.20398f, 16.796f, 6.08807f, 15.3881f, 5.91286f)
        curveTo(15.175f, 5.88634f, 15f, 5.71478f, 15f, 5.5f)
        curveTo(15f, 5.28522f, 15.175f, 5.11366f, 15.3881f, 5.08714f)
        }
        }.build()

        return _aiVoice!!
    }

private var _aiVoice: ImageVector? = null
