package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = ImageVector.Builder(
            name = "Trello",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8f)
        curveTo(6f, 7.05719f, 6f, 6.58579f, 6.29289f, 6.29289f)
        curveTo(6.58579f, 6f, 7.05719f, 6f, 8f, 6f)
        horizontalLineTo(8.5f)
        curveTo(9.44281f, 6f, 9.91421f, 6f, 10.2071f, 6.29289f)
        curveTo(10.5f, 6.58579f, 10.5f, 7.05719f, 10.5f, 8f)
        verticalLineTo(15f)
        curveTo(10.5f, 15.9428f, 10.5f, 16.4142f, 10.2071f, 16.7071f)
        curveTo(9.91421f, 17f, 9.44281f, 17f, 8.5f, 17f)
        horizontalLineTo(8f)
        curveTo(7.05719f, 17f, 6.58579f, 17f, 6.29289f, 16.7071f)
        curveTo(6f, 16.4142f, 6f, 15.9428f, 6f, 15f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 8f)
        curveTo(13.5f, 7.05719f, 13.5f, 6.58579f, 13.7929f, 6.29289f)
        curveTo(14.0858f, 6f, 14.5572f, 6f, 15.5f, 6f)
        horizontalLineTo(16f)
        curveTo(16.9428f, 6f, 17.4142f, 6f, 17.7071f, 6.29289f)
        curveTo(18f, 6.58579f, 18f, 7.05719f, 18f, 8f)
        verticalLineTo(10f)
        curveTo(18f, 10.9428f, 18f, 11.4142f, 17.7071f, 11.7071f)
        curveTo(17.4142f, 12f, 16.9428f, 12f, 16f, 12f)
        horizontalLineTo(15.5f)
        curveTo(14.5572f, 12f, 14.0858f, 12f, 13.7929f, 11.7071f)
        curveTo(13.5f, 11.4142f, 13.5f, 10.9428f, 13.5f, 10f)
        verticalLineTo(8f)
        }
        }.build()

        return _trello!!
    }

private var _trello: ImageVector? = null
