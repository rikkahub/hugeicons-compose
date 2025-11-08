package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Adzan: ImageVector
    get() {
        if (_adzan != null) {
            return _adzan!!
        }
        _adzan = ImageVector.Builder(
            name = "Adzan",
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
        moveTo(6.59279f, 12f)
        curveTo(2.73603f, 6.28571f, 10.1661f, 4.5f, 11.9987f, 2f)
        curveTo(13.8316f, 4.5f, 21.2614f, 6.28571f, 17.4021f, 12f)
        horizontalLineTo(6.59279f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        lineTo(12f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 12f)
        verticalLineTo(16.2857f)
        curveTo(6.5f, 18.9795f, 6.5f, 20.3263f, 7.30546f, 21.1632f)
        curveTo(8.11091f, 22f, 9.40728f, 22f, 12f, 22f)
        curveTo(14.5927f, 22f, 15.8891f, 22f, 16.6945f, 21.1632f)
        curveTo(17.5f, 20.3263f, 17.5f, 18.9795f, 17.5f, 16.2857f)
        verticalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 14f)
        lineTo(21f, 13.5f)
        moveTo(20f, 18f)
        lineTo(21f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 14f)
        lineTo(3f, 13.5f)
        moveTo(4f, 18f)
        lineTo(3f, 18.5f)
        }
        }.build()

        return _adzan!!
    }

private var _adzan: ImageVector? = null
