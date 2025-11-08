package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BrokenBone: ImageVector
    get() {
        if (_brokenBone != null) {
            return _brokenBone!!
        }
        _brokenBone = ImageVector.Builder(
            name = "BrokenBone",
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
        moveTo(6.28272f, 19.233f)
        curveTo(6.11917f, 19.7294f, 5.81349f, 20.1328f, 5.43094f, 20.4088f)
        moveTo(5.43094f, 20.4088f)
        curveTo(4.87517f, 20.8099f, 4.15714f, 20.9424f, 3.47692f, 20.7015f)
        curveTo(2.32849f, 20.2948f, 1.72271f, 18.978f, 2.12388f, 17.7603f)
        curveTo(2.43203f, 16.8249f, 3.24468f, 16.2201f, 4.12547f, 16.1742f)
        curveTo(4.57361f, 16.1509f, 5.04518f, 15.9411f, 5.18559f, 15.5149f)
        lineTo(6.67298f, 11f)
        lineTo(8.00006f, 13f)
        lineTo(10.0001f, 12f)
        lineTo(8.49208f, 16.7315f)
        curveTo(8.36092f, 17.1431f, 8.59538f, 17.575f, 8.92477f, 17.8544f)
        curveTo(9.6212f, 18.4451f, 9.92365f, 19.4585f, 9.6098f, 20.4111f)
        curveTo(9.20863f, 21.6289f, 7.95243f, 22.2863f, 6.804f, 21.8797f)
        curveTo(6.12378f, 21.6388f, 5.63394f, 21.0786f, 5.43094f, 20.4088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5436f, 5.32421f)
        curveTo(18.9979f, 5.07331f, 19.502f, 4.98221f, 19.9822f, 5.03295f)
        moveTo(19.9822f, 5.03295f)
        curveTo(20.68f, 5.10666f, 21.3278f, 5.47972f, 21.7004f, 6.09705f)
        curveTo(22.3294f, 7.13929f, 21.936f, 8.48309f, 20.8217f, 9.0985f)
        curveTo(19.9518f, 9.57893f, 18.8997f, 9.47344f, 18.1807f, 8.90821f)
        curveTo(17.8389f, 8.63947f, 17.3636f, 8.49844f, 16.9864f, 8.7147f)
        lineTo(13.0001f, 11f)
        verticalLineTo(9f)
        lineTo(11.0001f, 7.98057f)
        lineTo(15.1148f, 5.70815f)
        curveTo(15.5121f, 5.48872f, 15.6281f, 4.97807f, 15.5636f, 4.52878f)
        curveTo(15.4402f, 3.66842f, 15.8707f, 2.77446f, 16.7212f, 2.30477f)
        curveTo(17.8355f, 1.68936f, 19.2488f, 2.03537f, 19.8779f, 3.07761f)
        curveTo(20.2505f, 3.69494f, 20.2644f, 4.41805f, 19.9822f, 5.03295f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.00006f, 8f)
        lineTo(5.00006f, 8f)
        moveTo(9.00006f, 6f)
        lineTo(9.00006f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.0001f, 16f)
        lineTo(13.0001f, 18f)
        moveTo(15.0001f, 14f)
        lineTo(17.0001f, 14f)
        }
        }.build()

        return _brokenBone!!
    }

private var _brokenBone: ImageVector? = null
