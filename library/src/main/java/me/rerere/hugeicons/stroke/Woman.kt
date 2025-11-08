package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Woman: ImageVector
    get() {
        if (_woman != null) {
            return _woman!!
        }
        _woman = ImageVector.Builder(
            name = "Woman",
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
        moveTo(14f, 4f)
        curveTo(14f, 5.10457f, 13.1046f, 6f, 12f, 6f)
        curveTo(10.8954f, 6f, 10f, 5.10457f, 10f, 4f)
        curveTo(10f, 2.89543f, 10.8954f, 2f, 12f, 2f)
        curveTo(13.1046f, 2f, 14f, 2.89543f, 14f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0002f, 16f)
        verticalLineTo(20f)
        curveTo(10.0002f, 20.9428f, 10.0002f, 21.4142f, 10.2931f, 21.7071f)
        curveTo(10.586f, 22f, 11.0574f, 22f, 12.0002f, 22f)
        curveTo(12.943f, 22f, 13.4144f, 22f, 13.7073f, 21.7071f)
        curveTo(14.0002f, 21.4142f, 14.0002f, 20.9428f, 14.0002f, 20f)
        verticalLineTo(16f)
        lineTo(14.2603f, 16.0007f)
        curveTo(15.8127f, 16.0005f, 16.5889f, 16.0004f, 16.8927f, 15.5149f)
        curveTo(17.1965f, 15.0295f, 16.8312f, 14.3728f, 16.1007f, 13.0595f)
        lineTo(14.3008f, 9.82358f)
        curveTo(13.8476f, 9.00874f, 12.9628f, 8.49982f, 11.9996f, 8.5f)
        curveTo(11.0368f, 8.50018f, 10.1525f, 9.00901f, 9.69941f, 9.82351f)
        lineTo(7.89935f, 13.0595f)
        curveTo(7.1688f, 14.3728f, 6.80353f, 15.0294f, 7.10731f, 15.5149f)
        curveTo(7.41109f, 16.0004f, 8.1873f, 16.0005f, 9.73972f, 16.0007f)
        lineTo(10.0002f, 16f)
        }
        }.build()

        return _woman!!
    }

private var _woman: ImageVector? = null
