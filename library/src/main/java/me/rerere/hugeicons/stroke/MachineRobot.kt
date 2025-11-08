package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MachineRobot: ImageVector
    get() {
        if (_machineRobot != null) {
            return _machineRobot!!
        }
        _machineRobot = ImageVector.Builder(
            name = "MachineRobot",
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
        moveTo(17f, 13f)
        verticalLineTo(8f)
        curveTo(17f, 5.23858f, 14.7614f, 3f, 12f, 3f)
        curveTo(9.23858f, 3f, 7f, 5.23858f, 7f, 8f)
        verticalLineTo(13f)
        curveTo(7f, 14.8692f, 7f, 15.8038f, 7.40192f, 16.5f)
        curveTo(7.66523f, 16.9561f, 8.04394f, 17.3348f, 8.5f, 17.5981f)
        curveTo(9.19615f, 18f, 10.1308f, 18f, 12f, 18f)
        curveTo(13.8692f, 18f, 14.8038f, 18f, 15.5f, 17.5981f)
        curveTo(15.9561f, 17.3348f, 16.3348f, 16.9561f, 16.5981f, 16.5f)
        curveTo(17f, 15.8038f, 17f, 14.8692f, 17f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 21f)
        curveTo(18f, 19.8954f, 18.8954f, 19f, 20f, 19f)
        curveTo(21.1046f, 19f, 22f, 19.8954f, 22f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 21f)
        curveTo(2f, 19.8954f, 2.89543f, 19f, 4f, 19f)
        curveTo(5.10457f, 19f, 6f, 19.8954f, 6f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.992f, 7.5f)
        horizontalLineTo(14.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 7.5f)
        horizontalLineTo(10.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 19f)
        verticalLineTo(15f)
        curveTo(20f, 13.1144f, 20f, 12.1716f, 19.4142f, 11.5858f)
        curveTo(18.8284f, 11f, 17.8856f, 11f, 16f, 11f)
        horizontalLineTo(8f)
        curveTo(6.11438f, 11f, 5.17157f, 11f, 4.58579f, 11.5858f)
        curveTo(4f, 12.1716f, 4f, 13.1144f, 4f, 15f)
        verticalLineTo(19f)
        }
        }.build()

        return _machineRobot!!
    }

private var _machineRobot: ImageVector? = null
