package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Noodles: ImageVector
    get() {
        if (_noodles != null) {
            return _noodles!!
        }
        _noodles = ImageVector.Builder(
            name = "Noodles",
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
        moveTo(18f, 12f)
        curveTo(18f, 10.6193f, 16.8807f, 9.5f, 15.5f, 9.5f)
        curveTo(14.1193f, 9.5f, 13f, 10.6193f, 13f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 3f)
        verticalLineTo(12f)
        moveTo(8.5f, 2.5f)
        verticalLineTo(7.5f)
        moveTo(11f, 2f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 4.5f)
        lineTo(6f, 4.1875f)
        moveTo(20f, 2f)
        lineTo(13.5f, 3.01562f)
        moveTo(4f, 7f)
        lineTo(6f, 6.875f)
        moveTo(20f, 6f)
        lineTo(13.5f, 6.40625f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.91145f, 12f)
        horizontalLineTo(19.0886f)
        curveTo(20.6914f, 12f, 21.2786f, 12.3707f, 20.8787f, 13.9821f)
        curveTo(20.1733f, 16.8246f, 18.1759f, 17.5306f, 16.3304f, 19.3859f)
        curveTo(15.8819f, 19.8369f, 16.5798f, 20.5032f, 16.5802f, 20.9992f)
        curveTo(16.5809f, 21.933f, 15.6928f, 22f, 14.9854f, 22f)
        horizontalLineTo(9.0146f)
        curveTo(8.30717f, 22f, 7.41908f, 21.933f, 7.41982f, 20.9992f)
        curveTo(7.4202f, 20.5137f, 8.0972f, 19.8159f, 7.66957f, 19.3859f)
        curveTo(5.82407f, 17.5306f, 3.82674f, 16.8246f, 3.12128f, 13.9821f)
        curveTo(2.72136f, 12.3707f, 3.30857f, 12f, 4.91145f, 12f)
        }
        }.build()

        return _noodles!!
    }

private var _noodles: ImageVector? = null
