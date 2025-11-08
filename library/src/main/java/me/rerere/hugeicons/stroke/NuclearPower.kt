package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NuclearPower: ImageVector
    get() {
        if (_nuclearPower != null) {
            return _nuclearPower!!
        }
        _nuclearPower = ImageVector.Builder(
            name = "NuclearPower",
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
        moveTo(14f, 12.5f)
        curveTo(14f, 13.6046f, 13.1046f, 14.5f, 12f, 14.5f)
        curveTo(10.8954f, 14.5f, 10f, 13.6046f, 10f, 12.5f)
        curveTo(10f, 11.3954f, 10.8954f, 10.5f, 12f, 10.5f)
        curveTo(13.1046f, 10.5f, 14f, 11.3954f, 14f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9111f, 8.43439f)
        lineTo(15.8552f, 6.65198f)
        curveTo(16.5358f, 5.36682f, 16.8762f, 4.72424f, 16.5862f, 4.02175f)
        curveTo(16.2963f, 3.31926f, 15.7303f, 3.16307f, 14.5984f, 2.8507f)
        curveTo(13.7693f, 2.62192f, 12.8984f, 2.5f, 12f, 2.5f)
        curveTo(11.1016f, 2.5f, 10.2307f, 2.62192f, 9.40163f, 2.8507f)
        curveTo(8.26967f, 3.16307f, 7.70368f, 3.31926f, 7.41376f, 4.02175f)
        curveTo(7.12384f, 4.72424f, 7.46418f, 5.36682f, 8.14485f, 6.65198f)
        lineTo(9.08888f, 8.43439f)
        moveTo(16.9973f, 12.6649f)
        horizontalLineTo(19.0632f)
        curveTo(20.5386f, 12.6649f, 21.2763f, 12.6649f, 21.73f, 13.3019f)
        curveTo(22.1838f, 13.9388f, 22.0038f, 14.5449f, 21.6438f, 15.7571f)
        curveTo(21.1143f, 17.5399f, 20.1389f, 19.1197f, 18.853f, 20.3559f)
        curveTo(17.9893f, 21.1862f, 17.5575f, 21.6013f, 16.8282f, 21.4789f)
        curveTo(16.0989f, 21.3565f, 15.7574f, 20.7117f, 15.0743f, 19.4221f)
        lineTo(13.8658f, 17.1403f)
        moveTo(10.1342f, 17.1403f)
        lineTo(8.92566f, 19.4221f)
        curveTo(8.24263f, 20.7117f, 7.90112f, 21.3565f, 7.17181f, 21.4789f)
        curveTo(6.44249f, 21.6013f, 6.01067f, 21.1862f, 5.14702f, 20.3559f)
        curveTo(3.86105f, 19.1197f, 2.88572f, 17.5399f, 2.35623f, 15.7571f)
        curveTo(1.99622f, 14.5449f, 1.81621f, 13.9388f, 2.26995f, 13.3019f)
        curveTo(2.72369f, 12.6649f, 3.46138f, 12.6649f, 4.93677f, 12.6649f)
        horizontalLineTo(7.00267f)
        }
        }.build()

        return _nuclearPower!!
    }

private var _nuclearPower: ImageVector? = null
