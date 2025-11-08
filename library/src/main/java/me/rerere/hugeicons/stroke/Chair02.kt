package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Chair02: ImageVector
    get() {
        if (_chair02 != null) {
            return _chair02!!
        }
        _chair02 = ImageVector.Builder(
            name = "Chair02",
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
        moveTo(7f, 15f)
        verticalLineTo(22f)
        moveTo(17f, 15f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 11f)
        curveTo(10.4783f, 11f, 8.86931f, 11.2925f, 7.60803f, 11.6838f)
        curveTo(6.6583f, 11.9784f, 5.89434f, 13.322f, 6.01199f, 14.4128f)
        curveTo(6.05558f, 14.8169f, 6.36877f, 15f, 6.69807f, 15f)
        horizontalLineTo(17.3019f)
        curveTo(17.6312f, 15f, 17.9444f, 14.8169f, 17.988f, 14.4128f)
        curveTo(18.1057f, 13.322f, 17.3417f, 11.9784f, 16.392f, 11.6838f)
        curveTo(15.1307f, 11.2925f, 13.5217f, 11f, 12f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.08364f, 12f)
        lineTo(6.71797f, 8.2874f)
        curveTo(6.46316f, 5.70038f, 6.33575f, 4.40687f, 6.88692f, 3.47939f)
        curveTo(7.92424f, 1.73383f, 10.2405f, 2.01699f, 12f, 2.01699f)
        curveTo(13.7595f, 2.01699f, 16.0758f, 1.73383f, 17.1131f, 3.47939f)
        curveTo(17.6642f, 4.40687f, 17.5368f, 5.70038f, 17.282f, 8.28741f)
        lineTo(16.9164f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 18f)
        lineTo(17f, 18f)
        }
        }.build()

        return _chair02!!
    }

private var _chair02: ImageVector? = null
