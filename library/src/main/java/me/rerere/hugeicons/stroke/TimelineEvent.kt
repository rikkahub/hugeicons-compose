package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimelineEvent: ImageVector
    get() {
        if (_timelineEvent != null) {
            return _timelineEvent!!
        }
        _timelineEvent = ImageVector.Builder(
            name = "TimelineEvent",
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
        moveTo(12f, 22f)
        curveTo(13.1046f, 22f, 14f, 21.1046f, 14f, 20f)
        curveTo(14f, 18.8954f, 13.1046f, 18f, 12f, 18f)
        curveTo(10.8954f, 18f, 10f, 18.8954f, 10f, 20f)
        curveTo(10f, 21.1046f, 10.8954f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2f)
        horizontalLineTo(9f)
        curveTo(7.11438f, 2f, 6.17157f, 2f, 5.58579f, 2.58579f)
        curveTo(5f, 3.17157f, 5f, 4.11438f, 5f, 6f)
        verticalLineTo(9f)
        curveTo(5f, 10.8856f, 5f, 11.8284f, 5.58579f, 12.4142f)
        curveTo(6.17157f, 13f, 7.11438f, 13f, 9f, 13f)
        horizontalLineTo(10.5f)
        lineTo(12f, 15f)
        lineTo(13.5f, 13f)
        horizontalLineTo(15f)
        curveTo(16.8856f, 13f, 17.8284f, 13f, 18.4142f, 12.4142f)
        curveTo(19f, 11.8284f, 19f, 10.8856f, 19f, 9f)
        verticalLineTo(6f)
        curveTo(19f, 4.11438f, 19f, 3.17157f, 18.4142f, 2.58579f)
        curveTo(17.8284f, 2f, 16.8856f, 2f, 15f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 6f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 20f)
        horizontalLineTo(21f)
        moveTo(10f, 20f)
        horizontalLineTo(3f)
        }
        }.build()

        return _timelineEvent!!
    }

private var _timelineEvent: ImageVector? = null
