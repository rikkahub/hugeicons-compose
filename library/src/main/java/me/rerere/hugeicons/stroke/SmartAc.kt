package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SmartAc: ImageVector
    get() {
        if (_smartAc != null) {
            return _smartAc!!
        }
        _smartAc = ImageVector.Builder(
            name = "SmartAc",
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
        moveTo(16f, 3f)
        curveTo(18.3389f, 3f, 19.5083f, 3f, 20.3621f, 3.53647f)
        curveTo(20.8073f, 3.81621f, 21.1838f, 4.19267f, 21.4635f, 4.63789f)
        curveTo(22f, 5.49167f, 22f, 6.66111f, 22f, 9f)
        curveTo(22f, 11.3389f, 22f, 12.5083f, 21.4635f, 13.3621f)
        curveTo(21.1838f, 13.8073f, 20.8073f, 14.1838f, 20.3621f, 14.4635f)
        curveTo(19.5083f, 15f, 18.3389f, 15f, 16f, 15f)
        lineTo(8f, 15f)
        curveTo(5.66111f, 15f, 4.49167f, 15f, 3.63789f, 14.4635f)
        curveTo(3.19267f, 14.1838f, 2.81621f, 13.8073f, 2.53647f, 13.3621f)
        curveTo(2f, 12.5083f, 2f, 11.3389f, 2f, 9f)
        curveTo(2f, 6.66111f, 2f, 5.49167f, 2.53647f, 4.63789f)
        curveTo(2.81621f, 4.19267f, 3.19267f, 3.81621f, 3.63789f, 3.53647f)
        curveTo(4.49167f, 3f, 5.66111f, 3f, 8f, 3f)
        lineTo(16f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 12f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 7f)
        horizontalLineTo(18.009f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.8f, 18f)
        curveTo(6.8f, 18f, 7.6f, 19.875f, 6f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.2f, 18f)
        curveTo(17.2f, 18f, 16.4f, 19.875f, 18f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(21f)
        }
        }.build()

        return _smartAc!!
    }

private var _smartAc: ImageVector? = null
