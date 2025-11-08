package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextCenterlineCenterTop: ImageVector
    get() {
        if (_textCenterlineCenterTop != null) {
            return _textCenterlineCenterTop!!
        }
        _textCenterlineCenterTop = ImageVector.Builder(
            name = "TextCenterlineCenterTop",
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
        moveTo(3f, 3.5f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 3.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 9.5f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 9.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 15.5f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 21f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.58579f, 10.4142f)
        curveTo(9.17157f, 10.9999f, 10.1144f, 10.9999f, 12f, 10.9999f)
        curveTo(13.8856f, 10.9999f, 14.8284f, 10.9999f, 15.4142f, 10.4142f)
        curveTo(16f, 9.82837f, 16f, 8.88556f, 16f, 6.99994f)
        curveTo(16f, 5.11432f, 16f, 4.17151f, 15.4142f, 3.58573f)
        curveTo(14.8284f, 2.99994f, 13.8856f, 2.99994f, 12f, 2.99994f)
        curveTo(10.1144f, 2.99994f, 9.17157f, 2.99994f, 8.58579f, 3.58573f)
        curveTo(8f, 4.17151f, 8f, 5.11432f, 8f, 6.99994f)
        curveTo(8f, 8.88556f, 8f, 9.82837f, 8.58579f, 10.4142f)
        }
        }.build()

        return _textCenterlineCenterTop!!
    }

private var _textCenterlineCenterTop: ImageVector? = null
