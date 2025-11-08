package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ZoomSquare: ImageVector
    get() {
        if (_zoomSquare != null) {
            return _zoomSquare!!
        }
        _zoomSquare = ImageVector.Builder(
            name = "ZoomSquare",
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
        moveTo(6.5f, 11f)
        verticalLineTo(10f)
        curveTo(6.5f, 9.5286f, 6.5f, 9.29289f, 6.64645f, 9.14645f)
        curveTo(6.79289f, 9f, 7.0286f, 9f, 7.5f, 9f)
        horizontalLineTo(9f)
        curveTo(10.8856f, 9f, 11.8284f, 9f, 12.4142f, 9.58579f)
        curveTo(13f, 10.1716f, 13f, 11.1144f, 13f, 13f)
        verticalLineTo(14f)
        curveTo(13f, 14.4714f, 13f, 14.7071f, 12.8536f, 14.8536f)
        curveTo(12.7071f, 15f, 12.4714f, 15f, 12f, 15f)
        horizontalLineTo(10.5f)
        curveTo(8.61438f, 15f, 7.67157f, 15f, 7.08579f, 14.4142f)
        curveTo(6.5f, 13.8284f, 6.5f, 12.8856f, 6.5f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.4498f, 10.5352f)
        lineTo(15.7998f, 10.1976f)
        curveTo(16.5247f, 9.49854f, 16.8872f, 9.14899f, 17.1936f, 9.27553f)
        curveTo(17.5f, 9.40207f, 17.5f, 9.90131f, 17.5f, 10.8998f)
        verticalLineTo(13.1002f)
        curveTo(17.5f, 14.0987f, 17.5f, 14.5979f, 17.1936f, 14.7245f)
        curveTo(16.8872f, 14.851f, 16.5247f, 14.5015f, 15.7998f, 13.8024f)
        lineTo(15.4498f, 13.4648f)
        curveTo(15.0061f, 13.0369f, 15f, 13.0226f, 15f, 12.4115f)
        verticalLineTo(11.5885f)
        curveTo(15f, 10.9774f, 15.0061f, 10.9631f, 15.4498f, 10.5352f)
        }
        }.build()

        return _zoomSquare!!
    }

private var _zoomSquare: ImageVector? = null
