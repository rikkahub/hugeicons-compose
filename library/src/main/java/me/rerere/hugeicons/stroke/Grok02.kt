package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Grok02: ImageVector
    get() {
        if (_grok02 != null) {
            return _grok02!!
        }
        _grok02 = ImageVector.Builder(
            name = "Grok02",
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
        moveTo(7f, 9f)
        horizontalLineTo(3f)
        lineTo(12f, 22f)
        horizontalLineTo(16f)
        lineTo(7f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.14913f, 17.5016f)
        lineTo(3.00024f, 22f)
        horizontalLineTo(7.00024f)
        lineTo(8.13808f, 20.3745f)
        lineTo(6.14913f, 17.5016f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.9008f, 13.5706f)
        lineTo(21.0002f, 2f)
        horizontalLineTo(17.0002f)
        lineTo(10.9119f, 10.6976f)
        lineTo(12.9008f, 13.5706f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 10.2095f)
        verticalLineTo(22f)
        horizontalLineTo(21f)
        verticalLineTo(5.92383f)
        lineTo(18f, 10.2095f)
        }
        }.build()

        return _grok02!!
    }

private var _grok02: ImageVector? = null
