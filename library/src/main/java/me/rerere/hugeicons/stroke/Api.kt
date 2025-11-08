package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Api: ImageVector
    get() {
        if (_api != null) {
            return _api!!
        }
        _api = ImageVector.Builder(
            name = "Api",
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
        moveTo(6f, 13.5f)
        lineTo(7.5f, 9f)
        lineTo(9.375f, 13.5f)
        moveTo(6f, 13.5f)
        lineTo(5.5f, 15f)
        moveTo(6f, 13.5f)
        horizontalLineTo(9.375f)
        moveTo(9.375f, 13.5f)
        lineTo(10f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 12f)
        verticalLineTo(9.7f)
        curveTo(12.5f, 9.51387f, 12.5f, 9.42081f, 12.5245f, 9.34549f)
        curveTo(12.5739f, 9.19327f, 12.6933f, 9.07393f, 12.8455f, 9.02447f)
        curveTo(12.9208f, 9f, 13.0139f, 9f, 13.2f, 9f)
        horizontalLineTo(14.5f)
        curveTo(15.3284f, 9f, 16f, 9.67157f, 16f, 10.5f)
        curveTo(16f, 11.3284f, 15.3284f, 12f, 14.5f, 12f)
        horizontalLineTo(12.5f)
        moveTo(12.5f, 12f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 9f)
        verticalLineTo(15f)
        }
        }.build()

        return _api!!
    }

private var _api: ImageVector? = null
