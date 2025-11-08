package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FloorPlan: ImageVector
    get() {
        if (_floorPlan != null) {
            return _floorPlan!!
        }
        _floorPlan = ImageVector.Builder(
            name = "FloorPlan",
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
        moveTo(2.5f, 9.5f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 9.5f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 21.5f)
        lineTo(9.5f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 6.5f)
        verticalLineTo(2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 17f)
        curveTo(15f, 17f, 13f, 18.6223f, 13f, 21.5f)
        horizontalLineTo(10.5f)
        curveTo(6.72876f, 21.5f, 4.84315f, 21.5f, 3.67157f, 20.3284f)
        curveTo(2.5f, 19.1569f, 2.5f, 17.2712f, 2.5f, 13.5f)
        verticalLineTo(10.5f)
        curveTo(2.5f, 6.72876f, 2.5f, 4.84315f, 3.67157f, 3.67157f)
        curveTo(4.84315f, 2.5f, 6.72876f, 2.5f, 10.5f, 2.5f)
        horizontalLineTo(13.5f)
        curveTo(17.2712f, 2.5f, 19.1569f, 2.5f, 20.3284f, 3.67157f)
        curveTo(21.5f, 4.84315f, 21.5f, 6.72876f, 21.5f, 10.5f)
        verticalLineTo(17.8432f)
        curveTo(21.5f, 19.8628f, 19.8628f, 21.5f, 17.8432f, 21.5f)
        }
        }.build()

        return _floorPlan!!
    }

private var _floorPlan: ImageVector? = null
