package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SemiTruck: ImageVector
    get() {
        if (_semiTruck != null) {
            return _semiTruck!!
        }
        _semiTruck = ImageVector.Builder(
            name = "SemiTruck",
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
        moveTo(19f, 13.5f)
        horizontalLineTo(18f)
        curveTo(17.0572f, 13.5f, 16.5858f, 13.5f, 16.2929f, 13.2071f)
        curveTo(16f, 12.9142f, 16f, 12.4428f, 16f, 11.5f)
        verticalLineTo(8.5f)
        moveTo(19f, 13.5f)
        verticalLineTo(8.5f)
        moveTo(19f, 13.5f)
        curveTo(19.9319f, 13.5f, 20.3978f, 13.5f, 20.7654f, 13.6522f)
        curveTo(21.2554f, 13.8552f, 21.6448f, 14.2446f, 21.8478f, 14.7346f)
        curveTo(22f, 15.1022f, 22f, 15.5681f, 22f, 16.5f)
        curveTo(22f, 17.4428f, 22f, 17.9142f, 21.7071f, 18.2071f)
        curveTo(21.4142f, 18.5f, 20.9428f, 18.5f, 20f, 18.5f)
        horizontalLineTo(19.5f)
        moveTo(16f, 8.5f)
        horizontalLineTo(13f)
        moveTo(16f, 8.5f)
        horizontalLineTo(19f)
        moveTo(13f, 8.5f)
        verticalLineTo(18.5f)
        horizontalLineTo(15.5f)
        moveTo(13f, 8.5f)
        verticalLineTo(5.5f)
        horizontalLineTo(16f)
        curveTo(16.9319f, 5.5f, 17.3978f, 5.5f, 17.7654f, 5.65224f)
        curveTo(18.2554f, 5.85523f, 18.6448f, 6.24458f, 18.8478f, 6.73463f)
        curveTo(19f, 7.10218f, 19f, 7.56812f, 19f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 5.5f)
        curveTo(13f, 4.55719f, 13f, 4.08579f, 12.7071f, 3.79289f)
        curveTo(12.4142f, 3.5f, 11.9428f, 3.5f, 11f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18.5f)
        horizontalLineTo(13f)
        verticalLineTo(13.5f)
        horizontalLineTo(4f)
        curveTo(3.05719f, 13.5f, 2.58579f, 13.5f, 2.29289f, 13.7929f)
        curveTo(2f, 14.0858f, 2f, 14.5572f, 2f, 15.5f)
        verticalLineTo(16.5f)
        curveTo(2f, 17.4428f, 2f, 17.9142f, 2.29289f, 18.2071f)
        curveTo(2.58579f, 18.5f, 3.05719f, 18.5f, 4f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 18.5f)
        curveTo(19.5f, 19.6046f, 18.6046f, 20.5f, 17.5f, 20.5f)
        curveTo(16.3954f, 20.5f, 15.5f, 19.6046f, 15.5f, 18.5f)
        curveTo(15.5f, 17.3954f, 16.3954f, 16.5f, 17.5f, 16.5f)
        curveTo(18.6046f, 16.5f, 19.5f, 17.3954f, 19.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 18.5f)
        curveTo(8f, 19.6046f, 7.10457f, 20.5f, 6f, 20.5f)
        curveTo(4.89543f, 20.5f, 4f, 19.6046f, 4f, 18.5f)
        curveTo(4f, 17.3954f, 4.89543f, 16.5f, 6f, 16.5f)
        curveTo(7.10457f, 16.5f, 8f, 17.3954f, 8f, 18.5f)
        }
        }.build()

        return _semiTruck!!
    }

private var _semiTruck: ImageVector? = null
