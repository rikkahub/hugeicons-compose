package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChatBot: ImageVector
    get() {
        if (_chatBot != null) {
            return _chatBot!!
        }
        _chatBot = ImageVector.Builder(
            name = "ChatBot",
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
        moveTo(11f, 8f)
        horizontalLineTo(13f)
        curveTo(15.8284f, 8f, 17.2426f, 8f, 18.1213f, 8.87868f)
        curveTo(19f, 9.75736f, 19f, 11.1716f, 19f, 14f)
        curveTo(19f, 16.8284f, 19f, 18.2426f, 18.1213f, 19.1213f)
        curveTo(17.2426f, 20f, 15.8284f, 20f, 13f, 20f)
        horizontalLineTo(12f)
        curveTo(12f, 20f, 11.5f, 22f, 8f, 22f)
        curveTo(8f, 22f, 9f, 20.9913f, 9f, 19.9827f)
        curveTo(7.44655f, 19.9359f, 6.51998f, 19.7626f, 5.87868f, 19.1213f)
        curveTo(5f, 18.2426f, 5f, 16.8284f, 5f, 14f)
        curveTo(5f, 11.1716f, 5f, 9.75736f, 5.87868f, 8.87868f)
        curveTo(6.75736f, 8f, 8.17157f, 8f, 11f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11.5f)
        horizontalLineTo(19.5f)
        curveTo(20.4346f, 11.5f, 20.9019f, 11.5f, 21.25f, 11.701f)
        curveTo(21.478f, 11.8326f, 21.6674f, 12.022f, 21.799f, 12.25f)
        curveTo(22f, 12.5981f, 22f, 13.0654f, 22f, 14f)
        curveTo(22f, 14.9346f, 22f, 15.4019f, 21.799f, 15.75f)
        curveTo(21.6674f, 15.978f, 21.478f, 16.1674f, 21.25f, 16.299f)
        curveTo(20.9019f, 16.5f, 20.4346f, 16.5f, 19.5f, 16.5f)
        horizontalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 11.5f)
        horizontalLineTo(4.5f)
        curveTo(3.56538f, 11.5f, 3.09808f, 11.5f, 2.75f, 11.701f)
        curveTo(2.52197f, 11.8326f, 2.33261f, 12.022f, 2.20096f, 12.25f)
        curveTo(2f, 12.5981f, 2f, 13.0654f, 2f, 14f)
        curveTo(2f, 14.9346f, 2f, 15.4019f, 2.20096f, 15.75f)
        curveTo(2.33261f, 15.978f, 2.52197f, 16.1674f, 2.75f, 16.299f)
        curveTo(3.09808f, 16.5f, 3.56538f, 16.5f, 4.5f, 16.5f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 3.5f)
        curveTo(13.5f, 4.32843f, 12.8284f, 5f, 12f, 5f)
        curveTo(11.1716f, 5f, 10.5f, 4.32843f, 10.5f, 3.5f)
        curveTo(10.5f, 2.67157f, 11.1716f, 2f, 12f, 2f)
        curveTo(12.8284f, 2f, 13.5f, 2.67157f, 13.5f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 12f)
        verticalLineTo(13f)
        moveTo(15f, 12f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16.5f)
        curveTo(10f, 16.5f, 10.6667f, 17f, 12f, 17f)
        curveTo(13.3333f, 17f, 14f, 16.5f, 14f, 16.5f)
        }
        }.build()

        return _chatBot!!
    }

private var _chatBot: ImageVector? = null
