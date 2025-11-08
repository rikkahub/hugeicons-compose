package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Id: ImageVector
    get() {
        if (_id != null) {
            return _id!!
        }
        _id = ImageVector.Builder(
            name = "Id",
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
        moveTo(8.5f, 18f)
        curveTo(10.3135f, 16.0463f, 13.667f, 15.9543f, 15.5f, 18f)
        moveTo(13.9406f, 12f)
        curveTo(13.9406f, 13.1046f, 13.0688f, 14f, 11.9934f, 14f)
        curveTo(10.918f, 14f, 10.0462f, 13.1046f, 10.0462f, 12f)
        curveTo(10.0462f, 10.8954f, 10.918f, 10f, 11.9934f, 10f)
        curveTo(13.0688f, 10f, 13.9406f, 10.8954f, 13.9406f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 4.00195f)
        curveTo(6.85561f, 4.01181f, 5.44101f, 4.10427f, 4.52513f, 4.97195f)
        curveTo(3.5f, 5.94312f, 3.5f, 7.5062f, 3.5f, 10.6324f)
        verticalLineTo(15.3692f)
        curveTo(3.5f, 18.4954f, 3.5f, 20.0584f, 4.52513f, 21.0296f)
        curveTo(5.55025f, 22.0008f, 7.20017f, 22.0008f, 10.5f, 22.0008f)
        horizontalLineTo(13.5f)
        curveTo(16.7998f, 22.0008f, 18.4497f, 22.0008f, 19.4749f, 21.0296f)
        curveTo(20.5f, 20.0584f, 20.5f, 18.4954f, 20.5f, 15.3692f)
        verticalLineTo(10.6324f)
        curveTo(20.5f, 7.5062f, 20.5f, 5.94312f, 19.4749f, 4.97195f)
        curveTo(18.559f, 4.10427f, 17.1444f, 4.01181f, 14.5f, 4.00195f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.77216f, 3.63163f)
        curveTo(9.8681f, 3.21682f, 9.91608f, 3.00942f, 10.0082f, 2.84004f)
        curveTo(10.2229f, 2.44546f, 10.6188f, 2.15548f, 11.0914f, 2.0467f)
        curveTo(11.2943f, 2f, 11.5296f, 2f, 12f, 2f)
        curveTo(12.4704f, 2f, 12.7057f, 2f, 12.9086f, 2.0467f)
        curveTo(13.3812f, 2.15548f, 13.7771f, 2.44545f, 13.9918f, 2.84004f)
        curveTo(14.0839f, 3.00942f, 14.1319f, 3.21682f, 14.2278f, 3.63163f)
        lineTo(14.3111f, 3.99176f)
        curveTo(14.4813f, 4.72744f, 14.5664f, 5.09528f, 14.438f, 5.37824f)
        curveTo(14.3549f, 5.5615f, 14.2132f, 5.71842f, 14.031f, 5.82911f)
        curveTo(13.7496f, 6f, 13.3324f, 6f, 12.4981f, 6f)
        horizontalLineTo(11.5019f)
        curveTo(10.6676f, 6f, 10.2504f, 6f, 9.96901f, 5.82911f)
        curveTo(9.78677f, 5.71842f, 9.6451f, 5.5615f, 9.56197f, 5.37824f)
        curveTo(9.43361f, 5.09528f, 9.51869f, 4.72744f, 9.68886f, 3.99176f)
        lineTo(9.77216f, 3.63163f)
        }
        }.build()

        return _id!!
    }

private var _id: ImageVector? = null
