package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BodySoap: ImageVector
    get() {
        if (_bodySoap != null) {
            return _bodySoap!!
        }
        _bodySoap = ImageVector.Builder(
            name = "BodySoap",
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
        moveTo(4.5f, 13f)
        curveTo(4.5f, 10.2386f, 6.73858f, 8f, 9.5f, 8f)
        curveTo(12.2614f, 8f, 14.5f, 10.2386f, 14.5f, 13f)
        verticalLineTo(18f)
        curveTo(14.5f, 19.8856f, 14.5f, 20.8284f, 13.9142f, 21.4142f)
        curveTo(13.3284f, 22f, 12.3856f, 22f, 10.5f, 22f)
        horizontalLineTo(8.5f)
        curveTo(6.61438f, 22f, 5.67157f, 22f, 5.08579f, 21.4142f)
        curveTo(4.5f, 20.8284f, 4.5f, 19.8856f, 4.5f, 18f)
        verticalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 13.1122f)
        curveTo(10.8607f, 9.83944f, 8.89093f, 14.9405f, 4.5f, 13.8418f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 8f)
        verticalLineTo(7f)
        curveTo(7.5f, 6.05719f, 7.5f, 5.58579f, 7.79289f, 5.29289f)
        curveTo(8.08579f, 5f, 8.55719f, 5f, 9.5f, 5f)
        curveTo(10.4428f, 5f, 10.9142f, 5f, 11.2071f, 5.29289f)
        curveTo(11.5f, 5.58579f, 11.5f, 6.05719f, 11.5f, 7f)
        verticalLineTo(8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 5f)
        verticalLineTo(2f)
        moveTo(9.5f, 2f)
        horizontalLineTo(7.5f)
        moveTo(9.5f, 2f)
        horizontalLineTo(12.9229f)
        curveTo(13.9117f, 2f, 14.7493f, 2.39009f, 15.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.4414f, 8.97336f)
        curveTo(19.671f, 9.84608f, 19.2059f, 10.7313f, 18.4026f, 10.9505f)
        curveTo(17.5994f, 11.1697f, 16.7621f, 10.64f, 16.5325f, 9.76726f)
        curveTo(16.303f, 8.89454f, 17.3634f, 7f, 17.3634f, 7f)
        curveTo(17.3634f, 7f, 19.2118f, 8.10063f, 19.4414f, 8.97336f)
        }
        }.build()

        return _bodySoap!!
    }

private var _bodySoap: ImageVector? = null
