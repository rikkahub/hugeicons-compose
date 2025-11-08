package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Award03: ImageVector
    get() {
        if (_award03 != null) {
            return _award03!!
        }
        _award03 = ImageVector.Builder(
            name = "Award03",
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
        moveTo(7.6801f, 12.9866f)
        curveTo(7.01748f, 9.62725f, 6.68617f, 7.9476f, 7.40306f, 6.58098f)
        curveTo(8.11994f, 5.21437f, 9.66067f, 4.58848f, 12.7421f, 3.3367f)
        lineTo(13.37f, 3.08163f)
        curveTo(15.698f, 2.13592f, 16.862f, 1.66307f, 17.5646f, 2.27374f)
        curveTo(18.2671f, 2.88442f, 18.0196f, 4.15398f, 17.5247f, 6.69309f)
        lineTo(15.3206f, 18f)
        horizontalLineTo(8.66899f)
        lineTo(7.6801f, 12.9866f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 21f)
        curveTo(6f, 19.5858f, 6f, 18.8787f, 6.43934f, 18.4393f)
        curveTo(6.87868f, 18f, 7.58579f, 18f, 9f, 18f)
        horizontalLineTo(15f)
        curveTo(16.4142f, 18f, 17.1213f, 18f, 17.5607f, 18.4393f)
        curveTo(18f, 18.8787f, 18f, 19.5858f, 18f, 21f)
        verticalLineTo(22f)
        horizontalLineTo(6f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 22f)
        lineTo(20f, 22f)
        }
        }.build()

        return _award03!!
    }

private var _award03: ImageVector? = null
