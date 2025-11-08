package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Worry: ImageVector
    get() {
        if (_worry != null) {
            return _worry!!
        }
        _worry = ImageVector.Builder(
            name = "Worry",
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
        moveTo(16f, 15.6f)
        lineTo(15.7307f, 15.4f)
        curveTo(15.0125f, 14.8667f, 14.1672f, 14.8667f, 13.4491f, 15.4f)
        lineTo(13.1798f, 15.6f)
        curveTo(12.4616f, 16.1333f, 11.6163f, 16.1333f, 10.8982f, 15.6f)
        lineTo(10.6288f, 15.4f)
        curveTo(9.91069f, 14.8667f, 9.06539f, 14.8667f, 8.34723f, 15.4f)
        lineTo(8f, 15.6579f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00897f, 9f)
        horizontalLineTo(8f)
        moveTo(16f, 9f)
        horizontalLineTo(15.991f)
        }
        }.build()

        return _worry!!
    }

private var _worry: ImageVector? = null
