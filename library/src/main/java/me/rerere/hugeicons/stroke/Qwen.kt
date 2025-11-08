package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Qwen: ImageVector
    get() {
        if (_qwen != null) {
            return _qwen!!
        }
        _qwen = ImageVector.Builder(
            name = "Qwen",
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
        moveTo(9f, 2f)
        horizontalLineTo(12.5f)
        lineTo(14f, 4.5f)
        horizontalLineTo(19.13f)
        lineTo(20.5f, 7f)
        moveTo(22f, 14.5f)
        lineTo(20.3545f, 17.163f)
        horizontalLineTo(17.8782f)
        lineTo(15.0001f, 22f)
        horizontalLineTo(11.7825f)
        moveTo(5f, 20f)
        lineTo(3.5f, 17.5f)
        lineTo(4.5f, 14.5f)
        lineTo(2f, 9.5f)
        lineTo(4f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.1901f, 9.66219f)
        lineTo(20.5001f, 7.0008f)
        horizontalLineTo(9.99996f)
        lineTo(11f, 5.0004f)
        lineTo(8.99996f, 2.0004f)
        lineTo(6.74874f, 7.0008f)
        horizontalLineTo(4.00006f)
        lineTo(8.99996f, 17.0004f)
        horizontalLineTo(5.99996f)
        lineTo(4.99996f, 20.0004f)
        horizontalLineTo(10.5f)
        lineTo(11.7516f, 22.0004f)
        lineTo(17.4017f, 12.0659f)
        lineTo(18.9401f, 14.5004f)
        horizontalLineTo(22f)
        lineTo(19.1901f, 9.66219f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0001f, 15.5f)
        lineTo(9.00006f, 10f)
        horizontalLineTo(15.0001f)
        lineTo(12.0001f, 15.5f)
        }
        }.build()

        return _qwen!!
    }

private var _qwen: ImageVector? = null
