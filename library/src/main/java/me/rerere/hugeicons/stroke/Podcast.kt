package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Podcast: ImageVector
    get() {
        if (_podcast != null) {
            return _podcast!!
        }
        _podcast = ImageVector.Builder(
            name = "Podcast",
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
        moveTo(4.51555f, 17f)
        curveTo(3.55827f, 15.5699f, 3f, 13.8501f, 3f, 12f)
        curveTo(3f, 7.02944f, 7.02944f, 3f, 12f, 3f)
        curveTo(16.9706f, 3f, 21f, 7.02944f, 21f, 12f)
        curveTo(21f, 13.8501f, 20.4417f, 15.5699f, 19.4845f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 11f)
        curveTo(9f, 9.34315f, 10.3431f, 8f, 12f, 8f)
        curveTo(13.6569f, 8f, 15f, 9.34315f, 15f, 11f)
        verticalLineTo(13f)
        curveTo(15f, 14.6569f, 13.6569f, 16f, 12f, 16f)
        curveTo(10.3431f, 16f, 9f, 14.6569f, 9f, 13f)
        verticalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        lineTo(12f, 20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 21f)
        lineTo(12f, 19f)
        lineTo(14f, 21f)
        horizontalLineTo(10f)
        }
        }.build()

        return _podcast!!
    }

private var _podcast: ImageVector? = null
