package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Payment02: ImageVector
    get() {
        if (_payment02 != null) {
            return _payment02!!
        }
        _payment02 = ImageVector.Builder(
            name = "Payment02",
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
        moveTo(2f, 4.5f)
        horizontalLineTo(8.75736f)
        curveTo(9.55301f, 4.5f, 10.3161f, 4.81607f, 10.8787f, 5.37868f)
        lineTo(14f, 8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 13.5f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 7.5f)
        lineTo(10.5f, 9.5f)
        curveTo(11.0523f, 10.0523f, 11.0523f, 10.9477f, 10.5f, 11.5f)
        curveTo(9.94772f, 12.0523f, 9.05229f, 12.0523f, 8.5f, 11.5f)
        lineTo(7f, 10f)
        curveTo(6.13931f, 10.8607f, 4.77671f, 10.9575f, 3.80294f, 10.2272f)
        lineTo(3.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 11f)
        verticalLineTo(15.5f)
        curveTo(5f, 17.3856f, 5f, 18.3284f, 5.58579f, 18.9142f)
        curveTo(6.17157f, 19.5f, 7.11438f, 19.5f, 9f, 19.5f)
        horizontalLineTo(18f)
        curveTo(19.8856f, 19.5f, 20.8284f, 19.5f, 21.4142f, 18.9142f)
        curveTo(22f, 18.3284f, 22f, 17.3856f, 22f, 15.5f)
        verticalLineTo(12.5f)
        curveTo(22f, 10.6144f, 22f, 9.67157f, 21.4142f, 9.08579f)
        curveTo(20.8284f, 8.5f, 19.8856f, 8.5f, 18f, 8.5f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.25f, 14f)
        curveTo(15.25f, 14.9665f, 14.4665f, 15.75f, 13.5f, 15.75f)
        curveTo(12.5335f, 15.75f, 11.75f, 14.9665f, 11.75f, 14f)
        curveTo(11.75f, 13.0335f, 12.5335f, 12.25f, 13.5f, 12.25f)
        curveTo(14.4665f, 12.25f, 15.25f, 13.0335f, 15.25f, 14f)
        }
        }.build()

        return _payment02!!
    }

private var _payment02: ImageVector? = null
