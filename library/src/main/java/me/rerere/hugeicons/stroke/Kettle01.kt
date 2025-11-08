package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Kettle01: ImageVector
    get() {
        if (_kettle01 != null) {
            return _kettle01!!
        }
        _kettle01 = ImageVector.Builder(
            name = "Kettle01",
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
        moveTo(7f, 7f)
        lineTo(4.83809f, 7.49321f)
        curveTo(3.33351f, 7.83646f, 2.58121f, 8.00809f, 2.21219f, 8.64897f)
        curveTo(1.84317f, 9.28985f, 2.00392f, 10.1455f, 2.32541f, 11.8569f)
        lineTo(2.77129f, 14.2305f)
        curveTo(3.19487f, 16.4852f, 4.34422f, 17.2445f, 6f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.14058f, 7.78149f)
        lineTo(6.11202f, 18.5819f)
        curveTo(5.9597f, 20.1813f, 5.88354f, 20.9809f, 6.41933f, 21.4905f)
        curveTo(6.95512f, 22f, 7.87218f, 22f, 9.70631f, 22f)
        horizontalLineTo(16.2937f)
        curveTo(18.1278f, 22f, 19.0449f, 22f, 19.5807f, 21.4905f)
        curveTo(20.1165f, 20.9809f, 20.0403f, 20.1813f, 19.888f, 18.5819f)
        lineTo(18.8594f, 7.78149f)
        curveTo(18.5414f, 4.44177f, 16.0794f, 3f, 13f, 3f)
        curveTo(9.92061f, 3f, 7.45864f, 4.44177f, 7.14058f, 7.78149f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(20.9781f)
        curveTo(21.8375f, 7f, 22.1357f, 7.22852f, 21.9445f, 8.24057f)
        curveTo(21.6209f, 9.95337f, 20.6421f, 11.351f, 19.3558f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        curveTo(12f, 14f, 14f, 15f, 14f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 3f)
        verticalLineTo(2f)
        }
        }.build()

        return _kettle01!!
    }

private var _kettle01: ImageVector? = null
