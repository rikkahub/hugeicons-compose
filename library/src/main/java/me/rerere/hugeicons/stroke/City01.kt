package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.City01: ImageVector
    get() {
        if (_city01 != null) {
            return _city01!!
        }
        _city01 = ImageVector.Builder(
            name = "City01",
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
        moveTo(14f, 8f)
        horizontalLineTo(10f)
        curveTo(7.518f, 8f, 7f, 8.518f, 7f, 11f)
        verticalLineTo(22f)
        horizontalLineTo(17f)
        verticalLineTo(11f)
        curveTo(17f, 8.518f, 16.482f, 8f, 14f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 12f)
        lineTo(13f, 12f)
        moveTo(11f, 15f)
        horizontalLineTo(13f)
        moveTo(11f, 18f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 22f)
        verticalLineTo(8.18564f)
        curveTo(21f, 6.95735f, 21f, 6.3432f, 20.7013f, 5.84966f)
        curveTo(20.4026f, 5.35612f, 19.8647f, 5.08147f, 18.7889f, 4.53216f)
        lineTo(14.4472f, 2.31536f)
        curveTo(13.2868f, 1.72284f, 13f, 1.93166f, 13f, 3.22873f)
        verticalLineTo(7.7035f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        verticalLineTo(13f)
        curveTo(3f, 12.1727f, 3.17267f, 12f, 4f, 12f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 22f)
        horizontalLineTo(2f)
        }
        }.build()

        return _city01!!
    }

private var _city01: ImageVector? = null
