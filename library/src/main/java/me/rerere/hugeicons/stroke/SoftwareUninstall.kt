package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SoftwareUninstall: ImageVector
    get() {
        if (_softwareUninstall != null) {
            return _softwareUninstall!!
        }
        _softwareUninstall = ImageVector.Builder(
            name = "SoftwareUninstall",
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
        moveTo(9.5f, 10f)
        curveTo(9.5f, 11.1046f, 10.3954f, 12f, 11.5f, 12f)
        curveTo(12.6046f, 12f, 13.5f, 11.1046f, 13.5f, 10f)
        curveTo(13.5f, 8.89543f, 12.6046f, 8f, 11.5f, 8f)
        curveTo(10.3954f, 8f, 9.5f, 8.89543f, 9.5f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.57026f, 14f)
        curveTo(3.88958f, 12.8233f, 3.5f, 11.4571f, 3.5f, 10f)
        curveTo(3.5f, 5.58172f, 7.08172f, 2f, 11.5f, 2f)
        curveTo(15.9183f, 2f, 19.5f, 5.58172f, 19.5f, 10f)
        curveTo(19.5f, 11.4571f, 19.1104f, 12.8233f, 18.4297f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.35f, 22f)
        horizontalLineTo(5.65f)
        curveTo(4.38598f, 22f, 3.75398f, 22f, 3.29997f, 21.6148f)
        curveTo(3.10343f, 21.448f, 2.93468f, 21.2337f, 2.80335f, 20.9842f)
        curveTo(2.5f, 20.4076f, 2.5f, 19.6051f, 2.5f, 18f)
        curveTo(2.5f, 16.3949f, 2.5f, 15.5924f, 2.80335f, 15.0158f)
        curveTo(2.93468f, 14.7663f, 3.10343f, 14.552f, 3.29997f, 14.3852f)
        curveTo(3.75398f, 14f, 4.38598f, 14f, 5.65f, 14f)
        horizontalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.3906f, 6.61055f)
        lineTo(17.4021f, 4.59912f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 17f)
        lineTo(19f, 19.5f)
        moveTo(19f, 19.5f)
        lineTo(21.5f, 22f)
        moveTo(19f, 19.5f)
        lineTo(16.5f, 22f)
        moveTo(19f, 19.5f)
        lineTo(21.5f, 17f)
        }
        }.build()

        return _softwareUninstall!!
    }

private var _softwareUninstall: ImageVector? = null
