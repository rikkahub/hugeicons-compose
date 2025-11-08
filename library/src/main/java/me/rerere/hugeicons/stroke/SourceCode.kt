package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SourceCode: ImageVector
    get() {
        if (_sourceCode != null) {
            return _sourceCode!!
        }
        _sourceCode = ImageVector.Builder(
            name = "SourceCode",
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
        moveTo(17f, 8f)
        lineTo(18.8398f, 9.85008f)
        curveTo(19.6133f, 10.6279f, 20f, 11.0168f, 20f, 11.5f)
        curveTo(20f, 11.9832f, 19.6133f, 12.3721f, 18.8398f, 13.1499f)
        lineTo(17f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 8f)
        lineTo(5.16019f, 9.85008f)
        curveTo(4.38673f, 10.6279f, 4f, 11.0168f, 4f, 11.5f)
        curveTo(4f, 11.9832f, 4.38673f, 12.3721f, 5.16019f, 13.1499f)
        lineTo(7f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 4f)
        lineTo(9.5f, 20f)
        }
        }.build()

        return _sourceCode!!
    }

private var _sourceCode: ImageVector? = null
