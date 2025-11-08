package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sql: ImageVector
    get() {
        if (_sql != null) {
            return _sql!!
        }
        _sql = ImageVector.Builder(
            name = "Sql",
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
        moveTo(8.41465f, 10f)
        curveTo(8.20873f, 9.4174f, 7.65311f, 9f, 7f, 9f)
        curveTo(6.17157f, 9f, 5.5f, 9.67157f, 5.5f, 10.5f)
        curveTo(5.5f, 11.3284f, 6.17157f, 12f, 7f, 12f)
        curveTo(7.82843f, 12f, 8.5f, 12.6716f, 8.5f, 13.5f)
        curveTo(8.5f, 14.3284f, 7.82843f, 15f, 7f, 15f)
        curveTo(6.34689f, 15f, 5.79127f, 14.5826f, 5.58535f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 15f)
        curveTo(11.6716f, 15f, 11f, 14.3284f, 11f, 13.5f)
        verticalLineTo(10.5f)
        curveTo(11f, 9.67157f, 11.6716f, 9f, 12.5f, 9f)
        curveTo(13.3284f, 9f, 14f, 9.67157f, 14f, 10.5f)
        verticalLineTo(13.5f)
        curveTo(14f, 14.3284f, 13.3284f, 15f, 12.5f, 15f)
        moveTo(12.5f, 15f)
        lineTo(14f, 16.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 9f)
        verticalLineTo(13f)
        curveTo(16.5f, 13.9428f, 16.5f, 14.4142f, 16.7929f, 14.7071f)
        curveTo(17.0858f, 15f, 17.5572f, 15f, 18.5f, 15f)
        }
        }.build()

        return _sql!!
    }

private var _sql: ImageVector? = null
